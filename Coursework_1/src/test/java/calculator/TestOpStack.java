package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.OpStack;
import uk.ac.rhul.cs2800.Symbol;

class TestOpStack {
  
  OpStack operatorStack;

  @BeforeEach
  void setup() {
    operatorStack = new OpStack();
  }

  @Test
  void test() {
    OpStack opStack = new OpStack();
  }

  @Test
  void testPushToOpStack() {
    operatorStack.push(Symbol.PLUS);
  }
  
  @Test
  void testPopFromOpStack() throws BadTypeException {
    operatorStack.push(Symbol.MINUS);
    assertEquals(operatorStack.pop(), Symbol.MINUS); 
  }
  
  @Test
  void testPopMultipleFromOpStack() throws BadTypeException {
    operatorStack.push(Symbol.TIMES);
    operatorStack.push(Symbol.DIVIDE);
    assertEquals(operatorStack.pop(), Symbol.DIVIDE);
    assertEquals(operatorStack.size(), 1);
  }
  
  @Test
  void testTopfromOpStack() throws BadTypeException {
    operatorStack.push(Symbol.DIVIDE);
    assertEquals(operatorStack.top(), Symbol.DIVIDE);
    assertEquals(operatorStack.size(), 1);
  }
  
  @Test
  void testTopMultipleFromOpStack() throws BadTypeException {
    operatorStack.push(Symbol.TIMES);
    operatorStack.push(Symbol.PLUS);
    assertEquals(operatorStack.top(), Symbol.PLUS);
    assertEquals(operatorStack.size(), 2);
  }
  
  @Test
  void testIsEmpty() {
    assertEquals(operatorStack.isEmpty(), true);
  }

}
