package uk.ac.rhul.cs2800;

/**
 * I created this interface to make the method that RevPolishCalc and StandardCalc will used
 *
 * @author Viraj Patel (zkac174)
 *
 */
public interface Calculator {
  
  Float evaluate(String string) throws InvalidExpressionException, BadTypeException;
  
}
