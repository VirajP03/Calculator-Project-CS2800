package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * This class will implement the Reverse polish calculator and perform operations on that were
 * passed to it and then return the answer.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class RevPolishCalc implements Calculator {

  private NumStack values;


  public RevPolishCalc() {
    values = new NumStack();
  }

  /**
   * This method is used to check if the expression contains any letters and will return true.
   *
   * @param string The expression to be evaluated
   * @return true or false depending if the character contains a letter or not.
   */
  public Boolean testForLetter(String string) {
    for (int i = 0; i < string.length(); i++) {
      if (Character.isLetter(string.charAt(i))) {
        return true;
      }
    }
    return false;
  }

  /**
   * @param string The expression that will be evaluated.
   * @return The answer to the evaluation of the string entered.
   * @throws InvalidExpressionException if the string is empty.
   * @throws BadTypeException if the value popped from the stack isn't a float.
   */
  @Override
  public Float evaluate(String string) throws InvalidExpressionException, BadTypeException {
    if ((string == "") || (testForLetter(string))) { // Results in a string with numbers and symbols
      throw new InvalidExpressionException();
    } else {
      Scanner s = new Scanner(string);
      while (s.hasNext()) {
        String current = s.next();
        try {
          Float currentFloat = Float.parseFloat(current);
          values.push(currentFloat);
        } catch (NumberFormatException e) {
          Float val1 = values.pop();
          Float val2 = values.pop();
          if (current.equals("*")) {
            values.push(val2 * val1);
          } else if (current.equals("+")) {
            values.push(val2 + val1);
          }
        }
      }
      s.close();
    }
    return values.pop();
  }

}
