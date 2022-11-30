package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

}
