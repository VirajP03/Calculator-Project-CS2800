package uk.ac.rhul.cs2800;

/**
 * This class contains the operations used to maintain a stack specifically for Strings. Therefore
 * making it easier to manage and implement a stack for a String element. The methods within allow
 * you to add and remove a String, check the top value of the stack and check if the stack is empty.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class StrStack {

  private Stack strStack;

  /**
   * The constructor is used to initialise the strStack object as a Stack which is initially empty.
   * 
   */
  public StrStack() {
    strStack = new Stack();
  }

  /**
   * This method is used to create an entry containing the string which will then be placed at the
   * top of the stack.
   *
   * @param string used in the entry to be pushed to the stack.
   */
  public void push(String string) {
    Entry strEntry = new Entry(string);
    strStack.push(strEntry);
  }

  /**
   * This method is used to get the size of the String stack.
   *
   * @return the size of the String stack.
   */
  public int size() {
    return strStack.size();
  }

  /**
   *  This method is used to remove the String at the top of the strStack object and return it.
   *
   * @return The string at the top of the stack.
   * @throws BadTypeException if the value returned is not a symbol.
   */
  public String pop() throws BadTypeException {
    return strStack.pop().getString();
  }

  /**
   * This method returns the value at the top of strStack without removing it.
   *
   * @return The string at the top of the stack.
   * @throws BadTypeException if the value returned is not a string.
   */
  public String top() throws BadTypeException {
    return strStack.top().getString();
  }

  public Boolean isEmpty() { 
    return true;
  }

}
