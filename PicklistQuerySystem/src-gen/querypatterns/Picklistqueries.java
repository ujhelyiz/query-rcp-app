package querypatterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import querypatterns.PicklistcheckMatcher;
import querypatterns.util.PicklistcheckQuerySpecification;

/**
 * A pattern group formed of all patterns defined in picklistqueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file picklistqueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package querypatterns, the group contains the definition of the following patterns: <ul>
 * <li>picklistcheck</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Picklistqueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Picklistqueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Picklistqueries();
    }
    return INSTANCE;
    
  }
  
  private static Picklistqueries INSTANCE;
  
  private Picklistqueries() throws IncQueryException {
    querySpecifications.add(PicklistcheckQuerySpecification.instance());
    
  }
  
  public PicklistcheckQuerySpecification getPicklistcheck() throws IncQueryException {
    return PicklistcheckQuerySpecification.instance();
  }
  
  public PicklistcheckMatcher getPicklistcheck(final IncQueryEngine engine) throws IncQueryException {
    return PicklistcheckMatcher.on(engine);
  }
}
