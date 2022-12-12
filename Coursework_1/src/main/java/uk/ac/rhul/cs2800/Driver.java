// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Driver.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

/**
 * The main entry point for the program.
 * 
 * @author dave
 * 
 */
public class Driver {

  /**
   * Java programs start by executing main.
   * 
   * @param args The command line arguments
   * 
   */
  public static void main(String[] args) {

    // Create desired view type.
    if (System.console() != null) {
      AsciiView v = new AsciiView();
      new Controller(v);
      v.menu();
    } else {
      Launcher.startJavaFX(new Controller(), args);
    }
  }
}
