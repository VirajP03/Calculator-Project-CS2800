package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
  void testEvaluate() {
    assertEquals(rc.evaluate("3 4 +"), 7.0f);
  }
  

}
