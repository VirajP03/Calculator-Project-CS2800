package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.StrStack;

class TestStrStack {

  StrStack stringStack;

  @BeforeEach
  void setup() {
    stringStack = new StrStack();
  }
  
  @Test
  void test() {
    StrStack strStack = new StrStack();
  }
  
  @Test
  void testPush() {
    stringStack.push("Test1");
    assertEquals(stringStack.size(), 1);
  }
 
}
