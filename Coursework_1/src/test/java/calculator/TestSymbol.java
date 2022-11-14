package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.Symbol;

/**
 * @author Viraj Patel (zkac174)
 *
 */
class TestSymbol {

  Symbol symbol1;
  Symbol symbol2;
  Symbol symbol3;
  Symbol symbol4;
  Symbol symbol5;
  Symbol symbol6;
  Symbol symbol7;
    
  @BeforeEach
  void setup() {
    symbol1 = Symbol.LEFT_BRACKET;
    symbol2 = Symbol.RIGHT_BRACKET;
    symbol3 = Symbol.TIMES;
    symbol4 = Symbol.DIVIDE;
    symbol5 = Symbol.PLUS;
    symbol6 = Symbol.MINUS;
    symbol7 = Symbol.INVALID;
  }
  
  @Test
  // Test 1 - Created toString() and returned this.name();
  void test() {
    assertEquals(symbol1.toString(), "LEFT_BRACKET");
    assertEquals(symbol2.toString(), "RIGHT_BRACKET");
    assertEquals(symbol3.toString(), "TIMES");
    assertEquals(symbol4.toString(), "DIVIDE");
    assertEquals(symbol5.toString(), "PLUS");
    assertEquals(symbol6.toString(), "MINUS");
    assertEquals(symbol7.toString(), "INVALID");
  }

}
