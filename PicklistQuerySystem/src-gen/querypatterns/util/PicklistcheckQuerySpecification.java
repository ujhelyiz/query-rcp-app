package querypatterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import querypatterns.PicklistcheckMatch;
import querypatterns.PicklistcheckMatcher;

/**
 * A pattern-specific query specification that can instantiate PicklistcheckMatcher in a type-safe way.
 * 
 * @see PicklistcheckMatcher
 * @see PicklistcheckMatch
 * 
 */
@SuppressWarnings("all")
public final class PicklistcheckQuerySpecification extends BaseGeneratedQuerySpecification<PicklistcheckMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PicklistcheckQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected PicklistcheckMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PicklistcheckMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "querypatterns.picklistcheck";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("P");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("P", ""));
  }
  
  @Override
  public PicklistcheckMatch newEmptyMatch() {
    return PicklistcheckMatch.newEmptyMatch();
  }
  
  @Override
  public PicklistcheckMatch newMatch(final Object... parameters) {
    return PicklistcheckMatch.newMatch((picklist.model.picklist.Picklist) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_P = body.getOrCreateVariableByName("P");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_P, "P")
      ));
      
      new TypeUnary(body, var_P, getClassifierLiteral("http://picklist/1.0", "Picklist"), "http://picklist/1.0/Picklist");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PicklistcheckQuerySpecification INSTANCE = make();
    
    public static PicklistcheckQuerySpecification make() {
      return new PicklistcheckQuerySpecification();					
      
    }
  }
}
