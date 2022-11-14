package uk.ac.rhul.cs2800;

import java.util.Objects;

/**
 * This class is used to contain information about the elements that are being used in the stack.
 * They can be a number, symbol or a string.
 *
 * @author Viraj Patel (zkac174)
 *
 *
 */
public class Entry {

  private float number;
  private Symbol symbol;
  private Type type;
  private String myString;



  /**
   * This is the constructor for any entry that contains a symbol.
   *
   * @param value is used to initialise the float to be held in "number".
   */
  public Entry(float value) {
    this.number = value;
    type = Type.NUMBER;
  }

  /**
   * This is the constructor for any entry that contains a symbol.
   *
   * @param string is used to initialise the string to be held in "myString".
   */
  public Entry(String string) {
    this.myString = string;
    type = Type.STRING;
  }

  /**
   * This is the constructor for any entry that contains a symbol.
   *
   * @param symbol is used in to initialise the symbol to be held in "symbol".
   */
  public Entry(Symbol symbol) {
    this.symbol = symbol;
    type = type.SYMBOL;
  }

  /**
   * This method returns the type of the entry which was set in the constructor.
   *
   * @return type which is the type of the element held in the entry object.
   */
  public Type getType() {
    return type;
  }

  /**
   * This method returns the string held in the entry object.
   *
   * @return myString which is the string held in the entry object.
   * @throws BadTypeException if the entry doesn't contain a string and contains something else of a
   *         different data type.
   */
  public String getString() throws BadTypeException {
    if (type != Type.STRING) {
      throw new BadTypeException("Created other - asked for String");
    }
    return myString;
  }

  /**
   * This method returns the number (float) that is held in the entry object.
   *
   * @return number which is the held in the entry object
   * @throws BadTypeException if the entry doesn't contain a float and contains something else.
   */
  public float getValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException("Created other - asked for float");
    }
    return number;
  }

  /**
   * This method returns the symbol of an entry object.
   *
   * @return symbol which is the symbol associated to the entry object.
   * @throws BadTypeException if the entry isn't associated to a symbol and contains anything else.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (type != Type.SYMBOL) {
      throw new BadTypeException("Created other - asked for symbol");
    }
    return symbol;
  }

  @Override
  public int hashCode() {
    return Objects.hash(myString, number, symbol, type);
  }

  @Override
  // Checks if entries are equal
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    return Objects.equals(myString, other.myString)
        && Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
        && symbol == other.symbol && type == other.type;
  }



}
