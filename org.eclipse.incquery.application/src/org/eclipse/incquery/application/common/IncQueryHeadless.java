/*******************************************************************************
 * Copyright (c) 2004-2011 Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Abel Hegedus - initial API and implementation
 *    Istvan Rath - refactorings to accommodate to generic/patternspecific API differences
 *******************************************************************************/
package org.eclipse.incquery.application.common;


import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import picklist.model.picklist.Picklist;
import querypatterns.PicklistcheckMatch;
import querypatterns.PicklistcheckMatcher;
import querypatterns.util.PicklistcheckProcessor;

/**
 * @author Abel Hegedus
 * @author Istvan Rath
 *
 */
public class IncQueryHeadless {

    protected Resource loadModel(String modelPath) {
        URI fileURI = URI.createFileURI(modelPath);
        return loadModel(fileURI);
    }
    
	protected Resource loadModel(URI fileURI) {
		// Loads the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}
	
	protected void prettyPrintMatches(StringBuilder results, Collection<? extends IPatternMatch> matches) {
		for (IPatternMatch match : matches) {
			results.append(match.prettyPrint()+"; ");
		}
		if(matches.size() == 0) {
			results.append("Empty match set");
		}
		results.append("\n");
	}
	
	
	public String executeDemo(String modelPath) {
		final StringBuilder results = new StringBuilder();
		Resource resource = loadModel(modelPath);
		if (resource != null) {
			try {
				// get all matches of the pattern
				// initialization
				// phase 1: (managed) IncQueryEngine
				IncQueryEngine engine = IncQueryEngine.on(resource);
				// phase 2: the matcher itself
				PicklistcheckMatcher matcher = PicklistcheckMatcher.on(engine);
				// get all matches of the pattern
				Collection<PicklistcheckMatch> matches = matcher.getAllMatches();
				prettyPrintMatches(results, matches);
				// using a match processor
				matcher.forEachMatch(new PicklistcheckProcessor() {
					@Override
					public void process(Picklist o) {
						results.append("\tEObject: " + o.getDescription() + "\n");
					}
				});			
			} catch (IncQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		} else {
			results.append("Resource not found");
		}
		return results.toString();
	}	
	
}
