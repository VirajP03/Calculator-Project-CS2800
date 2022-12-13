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
public class StandardCalc {

  private static StrStack values;
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
  public Float evaluate(String string) throws InvalidExpressionException, BadTypeException {
    String rpn = "";
    if (string.equals("")) {
      throw new InvalidExpressionException();
    } else {
      if (string.length() < 3) {
        return Float.parseFloat(string);
      }
      ArrayList<String> operators = new ArrayList<String>(Arrays.asList("/", "*", "+", "-"));
      Scanner scanner = new Scanner(string);
      while (scanner.hasNext()) {
        String current = scanner.next();
        if (operators.contains(current)) {
          if (values.size() > 0) {
            if (operators.indexOf(current) > operators.indexOf(values.top())) {
              // add the check for brackets.
              String temp = values.pop();
              if (temp.equals("( ")) {
                values.push(current);
              } else {
                rpn += temp;
                values.push(current);
              }
            } else {
              if (values.size() == 0) {
                rpn += current + " ";
              } else {
                rpn += values.pop() + " ";
                values.push(current);
              }
            }
          } else {
            values.push(current + " ");
          }
        } else if (current.equals("(")) {
          values.push(current + " ");
        } else if (current.equals(")")) {
          while (!(current.equals("(")) && values.size() > 0) {
            String temp = values.pop();
            if (temp.equals(") ") || temp.equals("( ")) {
              rpn += "";
            } else {
              rpn += temp + " ";
            }
          }
        } else {
          rpn += current + " ";
        }

      }
      for (int i = 0; i < values.size(); i++) {
        rpn += values.pop() + " ";
      }
      scanner.close();
      rpn = rpn.substring(0, (rpn.length() - 1));
      return rpCalc.evaluate(rpn);
    }
  }
}
