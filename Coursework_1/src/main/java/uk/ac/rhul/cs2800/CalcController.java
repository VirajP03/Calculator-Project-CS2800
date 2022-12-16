// File name: $HeadURL:
// https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Calculator.java
// $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

/**
 * The model for this assembly. It has hooks to evaluate an arithmetic expression, but it fakes the
 * answer. It is a classical Singleton - notice that the class itself is final.
 *
 * @author dave and edited by Viraj Patel (zkac174)
 *
 */
public final class CalcController {

  private RevPolishCalc rpCalc;
  private StandardCalc sCalc;
  public boolean isInfix;

  /**
   * Even though there is only a default constructor it must be final so that new instances of this
   * Singleton cannot be created. It then instantiates the Reverse Polish calculator.
   */
  public CalcController() {
    rpCalc = new RevPolishCalc();
    sCalc = new StandardCalc();
  }

  /**
   * This method is used to set to determine which mode the user has selected and sets isInfix to
   * true or false.
   *
   * @param value if the mode is either infix or not, true or false respectively.
   */
  public void setIsInfix(boolean value) {
    isInfix = value;
  }

  /**
   * This method calls the evaluate method and takes the user input as an argument and returns the
   * solution.
   *
   * @param text the arithmetic expression
   * @return the evaluation
   * @throws BadTypeException if the type returned is a float.
   * @throws InvalidExpressionException if the input entered doesn't contain numbers or has an
   *         operator that isn't mathematical.
   */
  public Float evaluate(String text) throws InvalidExpressionException, BadTypeException {
    if (isInfix) {
      return rpCalc.evaluate(text);
    } else {
      return sCalc.evaluate(text);
    }
  }
}
