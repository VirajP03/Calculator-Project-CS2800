package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
  void testEvaluate() throws InvalidExpressionException {
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
  

}
