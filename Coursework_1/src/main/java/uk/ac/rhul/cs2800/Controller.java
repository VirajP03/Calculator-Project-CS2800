// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Controller.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

public class Controller implements ControllerInterface {
  CalcController calc = new CalcController();
  ViewInterface myView = null;

  private void calculateAction() throws InvalidExpressionException, BadTypeException {
    Float a = calc.evaluate(myView.getQuestion());
    myView.setAnswer(a.toString());
  }

  private void changeType(OpType t) {
    myView.setAnswer("Changed to " + t);
  }

  public Controller(ViewInterface v) {
    addView(v);
  }

  public Controller() {}

  @Override
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
