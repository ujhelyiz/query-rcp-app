package querypatterns;

import Picklist.model.picklist.Picklist;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import querypatterns.PicklistcheckMatch;
import querypatterns.util.PicklistcheckQuerySpecification;

/**
 * Generated pattern matcher API of the querypatterns.picklistcheck pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PicklistcheckMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern picklistcheck(P)={
 * 	Picklist(P);
 * }
 * </pre></code>
 * 
 * @see PicklistcheckMatch
 * @see PicklistcheckProcessor
 * @see PicklistcheckQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PicklistcheckMatcher extends BaseMatcher<PicklistcheckMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PicklistcheckMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PicklistcheckMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PicklistcheckMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_P = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PicklistcheckMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PicklistcheckMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return matches represented as a PicklistcheckMatch object.
   * 
   */
  public Collection<PicklistcheckMatch> getAllMatches(final Picklist pP) {
    return rawGetAllMatches(new Object[]{pP});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return a match represented as a PicklistcheckMatch object, or null if no match is found.
   * 
   */
  public PicklistcheckMatch getOneArbitraryMatch(final Picklist pP) {
    return rawGetOneArbitraryMatch(new Object[]{pP});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Picklist pP) {
    return rawHasMatch(new Object[]{pP});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Picklist pP) {
    return rawCountMatches(new Object[]{pP});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Picklist pP, final IMatchProcessor<? super PicklistcheckMatch> processor) {
    rawForEachMatch(new Object[]{pP}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Picklist pP, final IMatchProcessor<? super PicklistcheckMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PicklistcheckMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Picklist pP) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP the fixed value of pattern parameter P, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PicklistcheckMatch newMatch(final Picklist pP) {
    return new PicklistcheckMatch.Immutable(pP);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Picklist> rawAccumulateAllValuesOfP(final Object[] parameters) {
    Set<Picklist> results = new HashSet<Picklist>();
    rawAccumulateAllValues(POSITION_P, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Picklist> getAllValuesOfP() {
    return rawAccumulateAllValuesOfP(emptyArray());
  }
  
  @Override
  protected PicklistcheckMatch tupleToMatch(final org.eclipse.incquery.runtime.rete.tuple.Tuple t) {
    try {
    	return new PicklistcheckMatch.Immutable((Picklist.model.picklist.Picklist) t.get(POSITION_P));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected PicklistcheckMatch arrayToMatch(final Object[] match) {
    try {
    	return new PicklistcheckMatch.Immutable((Picklist.model.picklist.Picklist) match[POSITION_P]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected PicklistcheckMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new PicklistcheckMatch.Mutable((Picklist.model.picklist.Picklist) match[POSITION_P]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PicklistcheckMatcher> querySpecification() throws IncQueryException {
    return PicklistcheckQuerySpecification.instance();
  }
}
