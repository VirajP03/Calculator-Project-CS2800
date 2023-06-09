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
  void testPop() throws BadTypeException {
    numberStack.push(6.0f);
    assertEquals(numberStack.pop(), 6.0f);
  }
  
  @Test
  void testMultiplePop() throws BadTypeException {
    numberStack.push(6.0f);
    assertEquals(numberStack.pop(), 6.0f);
    numberStack.push(7.0f);
    assertEquals(numberStack.pop(), 7.0f);
  }
  
  @Test
  void testIsEmpty() {
    assertEquals(numberStack.isEmpty(), true);
  }
  
  @Test
  void testIsEmptyFalse() {
    numberStack.push(9.0f);
    assertEquals(numberStack.isEmpty(), false); 
  }
  
  @Test
  void testTop() throws BadTypeException {
    numberStack.push(7.0f);
    assertEquals(numberStack.top(), 7.0f);
    assertEquals(numberStack.isEmpty(), false);
  }
  
  @Test
  void testTopMultipleItems() throws BadTypeException {
    numberStack.push(6.0f);
    numberStack.push(2.0f);
    assertEquals(numberStack.top(), 2.0f);
  }
  
  
}
