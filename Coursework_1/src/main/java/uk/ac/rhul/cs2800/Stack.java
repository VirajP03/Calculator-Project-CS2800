package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class is used to contain the operations to manage a stack. There are methods that allow you
 * to add items, remove an item, and the ability to check the top of the stack. Some of this code
 * was inspired by Dave Cohen on Moodle
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class Stack {

  private int size;
  private Entry[] entryList = new Entry[2];
  private ArrayList<Entry> entries = new ArrayList<Entry>();

  /**
   * This method shows the size of the stack.
   *
   * @return size the current size of the stack.
   */
  public int size() {
    return size;
  }

  /**
   * This method adds a value to the top of the stack and increases the size by 1.
   *
   * @param entry is the most recent value to be added to the top of the stack.
   */
  public void push(Entry entry) {
    size = size + 1;
    entries.add(entry);
  }

  /**
   * This method returns the value at the top of the stack and removes it permanently.
   *
   * @return popValue which is the value at the top of the stack.
   */
  public Entry pop() {
    Entry popValue = top();
    entries.remove(size - 1); // Removes the value from the stack by removing it from "entries"
    size = size - 1;
    return popValue;
  }

  /**
   * This method retrieves the top element of the stack.
   *
   * @return top which is the most recent value that's at the top of the stack.
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    int topValue = size - 1; // Find the index which represents the top of the stack
    Entry top = entries.get(topValue);
    return top;
  }

}
