package uk.ac.rhul.cs2800;

/**
 * This class will implement the infix calculator where it uses the shunting yard algorithm to
 * rearrange the expression given into reverse polish notation.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class StandardCalc implements Calculator {

  @Override
  public Float evaluate(String string) throws InvalidExpressionException, BadTypeException {
    if (string.equals("")) {
      throw new InvalidExpressionException();
    } else {
      return 0.0f;
    }
  }
}
