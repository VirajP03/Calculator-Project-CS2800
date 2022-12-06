package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.InvalidExpressionException;
import uk.ac.rhul.cs2800.RevPolishCalc;

class TestRevPolishCalc {

  RevPolishCalc rc;

  @BeforeEach
  void setup() {
    rc = new RevPolishCalc();
  }

  @Test
  void test() {
    RevPolishCalc revCalc = new RevPolishCalc();
  }

  @Test
  void testEvaluate() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("3 4 +"), 7.0f);
  }

  @Test
  void testEvaluateOnEmpty() {
    assertThrows(InvalidExpressionException.class, () -> {
      rc.evaluate("");
    }, "InvalidExpressionException should be thrown");
  }

  @Test
  void testEvaluateStringWithLetter() {
    assertThrows(InvalidExpressionException.class, () -> {
      rc.evaluate("1 a");
    }, "InvalidExpressionException should be thrown");
  }

  @Test
  void testEvaluateSimpleExpression() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("1 1 +"), 2.0f);
  }

  @Test
  void testEvaluateMultiplication() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("2 3 *"), 6.0f);
  }
  
  @Test
  void testEvaluateMultiplicationSecond() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("9 9 *"), 81.0f);
  }
  
  @Test
  void testEvaluateDivision() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("4 2 /"), 2.0f);
  }
  
  @Test
  void testEvaluateSubtraction() throws InvalidExpressionException, BadTypeException {
    assertEquals(rc.evaluate("30 36 -"), -6.0f);
  }

}
