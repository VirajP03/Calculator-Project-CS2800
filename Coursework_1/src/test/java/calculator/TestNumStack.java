package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.NumStack;
import uk.ac.rhul.cs2800.Stack;
import uk.ac.rhul.cs2800.Symbol;

class TestNumStack {

  private NumStack numberStack;
  private NumStack numStack;
  
  
  @BeforeEach
  public void setup() {
    numberStack = new NumStack();
  }
  
  @Test
  void test() {
    numStack = new NumStack();
  }
  
  @Test
  void testPush() {
    numberStack.push(7.0f);
  }

}
