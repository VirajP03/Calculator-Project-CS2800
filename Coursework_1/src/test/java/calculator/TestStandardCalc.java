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


}
