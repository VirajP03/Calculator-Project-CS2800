// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/ControllerInterface.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $
package uk.ac.rhul.cs2800;

/**
 * So that a View can add itself to a Controller
 * 
 * @author dave
 *
 */
public interface ControllerInterface {
  /**
   * The method a View calls to register itself with a Controller
   * 
   * @param v a reference to new View to be associated with the Controller.
   */
  public void addView(ViewInterface v);
}
