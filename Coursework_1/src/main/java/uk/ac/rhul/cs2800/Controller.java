// File name: $HeadURL:
// https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Controller.java
// $
// Revision: $Revision: 184 $
// Last modified: $Date: 2022-12-15
// Last modified by: $Author: Viraj Patel (zkac174) $

package uk.ac.rhul.cs2800;

/**
 * This class is a bridge between the gui and the calculator. This class ensures that the calculator
 * changes mode and passes the expression entered in the GUI to the calculator and returns the
 * result to the GUI to display.
 *
 * @author Dave and Viraj Patel (zkac174)
 *
 */
public class Controller {
  
  CalcController calc = new CalcController();
  ViewInterface myView = null;
  
  /**
   * Constructor for a controller.
   * 
   */
  public Controller() {}

  /**
   * @throws InvalidExpressionException if the expression entered is not a valid operator or number.
   * @throws BadTypeException if the the value returned if of the wrong type.
   */
  private void calculateAction() throws InvalidExpressionException, BadTypeException {
    Float a = calc.evaluate(myView.getQuestion());
    myView.setAnswer(a.toString());
  }

  /**
   * This method determines if the user is either in infix or postfix mode. This is important in
   * CalcController as it is needed to determine which calculator is used.
   *
   * @param t the value that is either infix or postfix.
   */
  public void changeType(OpType t) {
    if (t == OpType.INFIX) {
      calc.setIsInfix(true);
    } else {
      calc.setIsInfix(false);
    }
  }

  /**
   *
   */
  public void addView(ViewInterface v) {
    myView = v;
    v.addCalcObserver(() -> {
      try {
        calculateAction();
      } catch (InvalidExpressionException | BadTypeException e) {
        e.printStackTrace();
      }
    });
    v.addTypeObserver(this::changeType);
  }
}
