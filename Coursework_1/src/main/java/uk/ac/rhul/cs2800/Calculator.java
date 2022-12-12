// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Calculator.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

/**
 * The model for this assembly. It has hooks to evaluate an arithmetic expression, but it fakes the
 * answer. It is a classical Singleton - notice that the class itself is final.
 * 
 * @author dave
 *
 */
public final class Calculator {
  /**
   * Even though there is only a default constructor it must be final so that nw instances of this
   * Singleton cannot be created.
   */
  private Calculator() {}

  /**
   * The (exactly) one instance of this class. Created in a lazy manner when it is required.
   */
  private static Calculator instance = null;

  /**
   * The hook to access this Singleton Calculator. The first time it is called it does the actual
   * instantiation - this is called lazy.
   * 
   * @return
   */
  public static Calculator getInstance() {
    if (instance == null) {
      instance = new Calculator();
    }
    return instance;
  }

  /**
   * Called to actually evaluate an arithmetic expression.
   * 
   * @param text the arithmetic expression
   * @return the evaluation
   */
  public Float evaluate(String text) {
    return 23.0f;
  }
}
