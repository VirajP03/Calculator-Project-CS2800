package uk.ac.rhul.cs2800;

import java.util.ArrayList;
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

  @Override
  public Float evaluate(String string) throws InvalidExpressionException, BadTypeException {
    String rpn = "";
    if (string.equals("")) {
      throw new InvalidExpressionException();
    } else {
      ArrayList<String> numbers = new ArrayList<String>();
      Scanner scanner = new Scanner(string);
      while (scanner.hasNext()) {
        String current = scanner.next();
        if (current.equals("+") || current.equals("-")) {
          values.push(current);
        } else {
          numbers.add(current);
        }
      }
      if (numbers.size() == 1) {
        return Float.parseFloat(string);
      } else {
        for (int i = 0; i < numbers.size(); i++) {
          rpn += numbers.get(i) + " ";
        }
        rpn += values.pop();
      }
    }
    return rpCalc.evaluate(rpn);
  }
}
