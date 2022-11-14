package uk.ac.rhul.cs2800;

/**
 * This Enum class holds the values that appears on the calculator. It holds the value that will be
 * used on a calculator to complete operations.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public enum Symbol {
  LEFT_BRACKET, RIGHT_BRACKET, TIMES, DIVIDE, PLUS, MINUS, INVALID;

  /**
   * This method returns the name of the Symbol in a string format.
   *
   */
  @Override
  public String toString() {
    return this.name();
  }
}
