package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.Stack;
import uk.ac.rhul.cs2800.Symbol;

/**
 * @author Viraj Patel (zkac174)
 *
 */
class TestStack {

  private Stack stack;
  private Entry entry1;
  private Entry entry2;
  private Entry entry3;
  private Entry entry4;


  @BeforeEach
  public void setup() {
    stack = new Stack();
    entry1 = new Entry(9.0f);
    entry2 = new Entry(Symbol.PLUS);
    entry3 = new Entry(10.0f);
    entry4 = new Entry(Symbol.TIMES);
  }

  @Test
  // Test 0 - To pass I created the stack class
  void test() {
    Stack stack = new Stack();
  }

  @Test
  // Test 1 - To pass the test, zero was returned
  void testSize() {
    assertEquals(stack.size(), 0, "An empty stack should have the size of 0");
  }

  @Test
  // Test 2 - To pass the test, size() was changed to return the size variable.
  // "size" created to hold stack size and this increased by 1 when item pushed.
  void testPush() {
    stack.push(entry1);
    assertEquals(stack.size(), 1, "The size of a stack with one item should be 1");
  }

  @Test
  // Test 3 - To pass threw the exception if "size" is 0 as you can't pop from empty stack
  void testPopOnEmpty() {
    assertThrows(EmptyStackException.class, () -> {
      stack.pop();
    }, "EmptyStackException should be thrown");
  }

  @Test
  // Test 4 - To pass the test I made a variable "value" to hold item most recently pushed
  // I then decrease "size" by 1.
  void testPop() {
    stack.push(entry1);
    assertEquals(stack.pop(), entry1,
        "The item pushed from the stack should be removed and returned");
    assertEquals(stack.size(), 0, "The size of the stack should be 0 when an item has been popped");
  }

  @Test // Test 5 - To pass, The "size" is checked if it's 0, if so exception thrown
  void testTopOnEmpty() {
    assertThrows(EmptyStackException.class, () -> {
      stack.top();
    }, "EmptyStackException should be thrown when checking the top of an empty stack");
  }

  @Test
  // Test 5 - To pass, I returned "value" without decreasing size
  void testTop() {
    stack.push(entry1);
    assertEquals(stack.size(), 1, "The size of the stack should be one after one item pushed");
    assertEquals(stack.top(), entry1);
    assertEquals(stack.size(), 1, "The size of the stack should remain the same");
  }

  @Test
  // Test 7 - To pass, I created an array called "entries" that held 2 items
  // I used "size" to determine positioning of new item and removed "values"
  void testPushTwice() {
    stack.push(entry1);
    stack.push(entry2);
    assertEquals(stack.size(), 2, "The size of a stack with two items should be 2");
  }

  @Test
  // Test 8 - To pass, I changed pop() to return the value at ("size"-1) of the array
  // Then decreased size by 1;
  void testPopWithArray() {
    stack.push(entry1);
    stack.push(entry2);
    assertEquals(stack.pop(), entry2);
    assertEquals(stack.size(), 1, "The size of a stack with two items should be 1");
  }

  @Test
  // Test 9 - to pass I changed top() to return the value at "size"-1 of the array
  void testTopWithArray() {
    stack.push(entry1);
    stack.push(entry2);
    assertEquals(stack.top(), entry2);
    assertEquals(stack.size(), 2);
  }

  @Test
  // Test 10 - To pass, I changed the size of "entries" to 6.
  void testPushSix() {
    stack.push(entry1);
    stack.push(entry2);
    stack.push(entry3);
    stack.push(entry4);
    Entry entry5 = new Entry(8.0f);
    Entry entry6 = new Entry(Symbol.DIVIDE);
    stack.push(entry5);
    stack.push(entry6);
    assertEquals(stack.size(), 6, "The size of the stack should be 6");
  }

  @Test
  // Test 11 - To pass, I increased the size "entries" to 100;
  void testPushOneHundred() {
    for (int i = 0; i < 100; i++) {
      stack.push(entry3);
    }
    assertEquals(stack.size(), 100, "The size of the stack should be 1000");
  }


  @Test
  // Test 12 - To pass, I changed the "entries" to an ArrayList as it's size isn't fixed
  // I used add() from ArrayList to push to the stack instead of adding to the array manually
  void testPushFiveHundred() {
    for (int i = 0; i < 500; i++) {
      stack.push(entry3);
    }
    assertEquals(stack.size(), 500, "The size of the stack should be 500");
  }

  @Test
  // Test 13 - To pass, I kept "size"-1 to identify the value at the top of the stack
  // I used get() to find the value at ("size"-1) then decrease "size" by 1 and returned the value
  void testPopMultiple() {
    stack.push(entry1);
    stack.push(entry2);
    assertEquals(stack.pop(), entry2);
    assertEquals(stack.pop(), entry1);
    assertEquals(stack.size(), 0);
  }

  @Test
  // Test 14 - Changed pop() to use top() to get the top element of the stack
  // To avoid the repetition code smell, the EmptyStackException is still thrown, but using top()
  void testPushThenPop() {
    stack.push(entry1);
    stack.push(entry2);
    assertEquals(stack.pop(), entry2);
    assertEquals(stack.size(), 1, "Test after pop to see if the size has decreased");
  }
}


