package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * This class will implement the Reverse polish calculator and perform operations on that were
 * passed to it and then return the answer. It will use a NumStack object and will push and pop from
 * it to perform the calculations and return the solution to the expression entered.
 *
 * @author Viraj Patel (zkac174)
 *
 */

public class RevPolishCalc implements CalculatorInterface {


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
   * This method calculates the expression provided, it reads through the entire string whilst
   * placing numbers into a stack and when reading an operator it will pop the top two values from
   * the stack of numbers and perform the correct operation. It will then do this until the whole
   * string is read and will return the correct answer.
   *
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
          switch (current) {

            case ("*"):
              values.push(val2 * val1);
              break;

            case ("+"):
              values.push(val2 + val1);
              break;

            case ("/"):
              values.push(val2 / val1);
              break;

            case ("-"):
              values.push(val2 - val1);
              break;

            default:
              throw new InvalidExpressionException();
          }
        }
      }
      s.close();
    }
    return values.pop();
  }

}
