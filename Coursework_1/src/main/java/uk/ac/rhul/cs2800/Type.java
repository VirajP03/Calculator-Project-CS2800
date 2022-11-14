package uk.ac.rhul.cs2800;

/**
 * This enum class is used to determine the type of the entry that has been added to the stack. This
 * will be used in the entry class to verify the type of the entry and to ensure it is valid.
 *
 * @author Viraj Patel (zkac174)
 *
 *
 */
public enum Type {
  NUMBER, SYMBOL, STRING, INVALID;

  /**
   * This method returns the enum in a string format.
   * 
   */
  @Override
  public String toString() {
    return this.name();
  }
}
