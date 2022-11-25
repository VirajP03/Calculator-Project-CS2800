package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.NumStack;

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
  
  @Test
  void testPop() throws EmptyStackException, BadTypeException {
    numberStack.push(7.0f);
    assertEquals(numberStack.pop(), 7.0f);
  }
}
