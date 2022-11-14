package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.Type;

/**
 * @author Viraj Patel (zkac174)
 *
 */
class TestType {

  Type type1;
  Type type2;
  Type type3;
  Type type4;
    
  @BeforeEach
  void setup() {
    type1 = Type.NUMBER;
    type2 = Type.STRING;
    type3 = Type.SYMBOL;
    type4 = Type.INVALID;
  }
  
  
  @Test
  // Test 1 - Created toString() and returned this.name();
  void testString() {
    assertEquals(type1.toString(), "NUMBER");
    assertEquals(type2.toString(), "STRING");
    assertEquals(type3.toString(), "SYMBOL");
    assertEquals(type4.toString(), "INVALID");
  }

}
