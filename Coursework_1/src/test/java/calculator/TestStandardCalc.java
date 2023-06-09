package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.InvalidExpressionException;
import uk.ac.rhul.cs2800.StandardCalc;

class TestStandardCalc {

  StandardCalc infix;

  @BeforeEach
  void setup() {
    infix = new StandardCalc();
  }

  @Test
  void test() {
    StandardCalc sc = new StandardCalc();
  }

  @Test
  void testEvaluate() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("0"), 0.0f);
  }

  @Test
  void testEvaluateOnEmpty() {
    assertThrows(InvalidExpressionException.class, () -> {
      infix.evaluate("");
    }, "InvalidExpressionException should be thrown");
  }
  
  @Test
  void testEvaluateAddition() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("1 + 1"), 2.0f);
  }
  
  @Test
  void testEvaluateSubtraction() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("1 - 1"), 0.0f);
  }
  
  @Test
  void testEvaluateMultiplication() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("7 * 9"), 63.0f);
  }
  
  @Test
  void testEvaluateDivison() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("5 / 2"), 2.5f);
  }
  
  @Test
  void testEvaluateMulti() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("7 - 5 + 19"), 21.0f);
  }
  
  @Test
  void testEvaluateBrackets() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("( 7 * 1 ) - 9"), -2.0f);
  }
    
  @Test
  void testEvaluateBracketsNoSpaces() throws InvalidExpressionException, BadTypeException {
    assertEquals(infix.evaluate("(7 * 1) - 9"), -2.0f);
  }
}
