package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.StrStack;
import uk.ac.rhul.cs2800.Symbol;

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
  
  @Test
  void testPopFromStrStack() throws BadTypeException {
    stringStack.push("Test2");
    assertEquals(stringStack.pop(), "Test2");
  }
  
  @Test
  void testPopMultipleFromStrStack() throws BadTypeException {
    stringStack.push("Test3");
    stringStack.push("Test3.2");
    assertEquals(stringStack.pop(), "Test3.2");
    assertEquals(stringStack.size(), 1);
  }
  
  @Test
  void testTopfromStrStack() {
    stringStack.push("Test4");
    assertEquals(stringStack.top(), "Test4");
    assertEquals(stringStack.size(), 1);
  }
}
