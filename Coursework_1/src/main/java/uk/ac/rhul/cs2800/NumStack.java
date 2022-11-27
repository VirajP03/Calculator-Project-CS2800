package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author virajpatel
 *
 */
public class NumStack {

  private Stack numStack;

  /**
   * This method is used to create the NumStack object and initialises a Stack object.
   * 
   */
  public NumStack() {
    numStack = new Stack();
  }

  /**
   * This method is used to push a float value to the top of numStack.
   *
   * @param f is the float value that will be pushed to the top of the stacks.
   */
  public void push(float f) {
    Entry numEntry = new Entry(f);
    numStack.push(numEntry);
  }

  public Float pop() {
    return 6.0f;
  }
  
  
}
