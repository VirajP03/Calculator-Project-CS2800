// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Observer.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

/**
 * This defines a new functional type that we can then name as more meaningful for an observer
 * notification.
 * 
 * @author dave
 *
 */
@FunctionalInterface
public interface Observer {
  /**
   * The named mechanism that we will use when we are notifying an Observer.
   */
  public void tell();
}
