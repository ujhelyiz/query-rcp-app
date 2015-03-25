package querypatterns.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
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
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected PicklistcheckMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PicklistcheckMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "PicklistQuerySystem";
    
  }
  
  @Override
  protected String patternName() {
    return "querypatterns.picklistcheck";
    
  }
  
  private PicklistcheckQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<PicklistcheckQuerySpecification> {
    @Override
    public PicklistcheckQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static PicklistcheckQuerySpecification INSTANCE = make();
    
    public static PicklistcheckQuerySpecification make() {
      try {
      	return new PicklistcheckQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
