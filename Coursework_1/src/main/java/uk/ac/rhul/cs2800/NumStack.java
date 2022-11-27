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

  /**
   * This method is used to remove the float at the top of a numStack object and return it.
   *
   * @return The float value from the top of the numStack.
   * @throws BadTypeException if the value returned is not a float.
   */
  public Float pop() throws BadTypeException {
    return numStack.pop().getValue();
  }

  /**
   * This method checks if the numStack contains any elements.
   *
   * @return true or false if the size is or isn't equal to 0 respectively.
   */
  public boolean isEmpty() {
    return numStack.size() == 0;
  }

  
  /**
   * This method returns the value at the top of numStack without removing it. 
   *
   * @return The float value at the top of the stack.
   * @throws BadTypeException if the value returned is not a float.
   */
  public Float top() throws BadTypeException {
    Entry numEntry = numStack.top();
    return numEntry.getValue();
  }
}
