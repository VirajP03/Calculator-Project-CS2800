package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class will implement the infix calculator where it uses the shunting yard algorithm to
 * rearrange the expression given into reverse polish notation.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class StandardCalc implements Calculator {

  private StrStack values;
  private RevPolishCalc rpCalc;


  public StandardCalc() {
    values = new StrStack();
    rpCalc = new RevPolishCalc();
  }

  /**
   * This method takes the string that is given in infix and converts it into a string that is in
   * Reverse Polish Notation and will use a Reverse Polish calculator to provide the correct answer.
   *
   * @param string The expression that will be evaluated.
   * @return The answer to the evaluation of the string entered.
   * @throws InvalidExpressionException if the string is empty.
   * @throws BadTypeException if the value popped from the stack isn't a float.
   */
  @Override
  public Float evaluate(String string) throws InvalidExpressionException, BadTypeException {
    String rpn = "";
    if (string.equals("")) {
      throw new InvalidExpressionException();
    } else {
      ArrayList<String> numbers = new ArrayList<String>();
      ArrayList<String> operators = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));
      Scanner scanner = new Scanner(string);
      while (scanner.hasNext()) {
        String current = scanner.next();
        if (operators.contains(current)) {
          values.push(current);
        } else {
          numbers.add(current);
        }
      }
      if (numbers.size() == 1) {
        scanner.close();
        return Float.parseFloat(string);
      } else {
        for (int i = 0; i < numbers.size(); i++) {
          rpn += numbers.get(i) + " ";
        }
        rpn += values.pop();
      }
      scanner.close();
    }
    return rpCalc.evaluate(rpn);
  }
}
