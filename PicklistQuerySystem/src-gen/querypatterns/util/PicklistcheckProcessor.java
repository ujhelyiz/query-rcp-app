package querypatterns.util;

import Picklist.model.picklist.Picklist;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import querypatterns.PicklistcheckMatch;

/**
 * A match processor tailored for the querypatterns.picklistcheck pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PicklistcheckProcessor implements IMatchProcessor<PicklistcheckMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter P in the currently processed match 
   * 
   */
  public abstract void process(final Picklist pP);
  
  @Override
  public void process(final PicklistcheckMatch match) {
    process(match.getP());
    
  }
}
