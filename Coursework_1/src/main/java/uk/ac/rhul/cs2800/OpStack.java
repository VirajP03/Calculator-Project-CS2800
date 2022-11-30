package uk.ac.rhul.cs2800;

/**
 * This class contains the operations used to maintain a stack specifically for Symbol values,
 * making it easier to manage the operations of a stack with Symbol objects. The methods within
 * allow you to add and remove a symbol, check the top value of the stack and check if the stack is
 * empty.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class OpStack {

  private Stack opStack;

  /**
   * The constructor is used to initialise the opStack object as a Stack which is empty.
   * 
   */
  public OpStack() {
    opStack = new Stack();
  }

  /**
   * This method is used to push a Symbol value to the top of opStack.
   *
   * @param operation is the symbol that will be used to create an Entry which will be pushed to the
   *        top of the Stack.
   */
  public void push(Symbol operation) {
    Entry opEntry = new Entry(operation);
    opStack.push(opEntry);
  }

  /**
   * This method is used to remove the symbol at the top of the opStack object and return it.
   *
   * @return The Symbol from the top of the opStack.
   * @throws BadTypeException if the value returned is not of type Symbol.
   */
  public Symbol pop() throws BadTypeException {
    return opStack.pop().getSymbol();
  }

  /**
   * This method returns the size of the stack.
   *
   * @return the size of the stack as a integer.
   */
  public int size() {
    return opStack.size();
  }
}
