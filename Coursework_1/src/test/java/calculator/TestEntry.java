package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.Symbol;
import uk.ac.rhul.cs2800.Type;

/**
 * @author Viraj Patel (zkac174)
 *
 */
class TestEntry {

  Entry entry1;
  Entry entry2;
  Entry entry3;
  Entry entry4;

  @BeforeEach
  // Creates entry objects, tests won't pass if constructors don't work
  // Sets "number"/"myString"/"symbol" depending on argument and sets "type" accordingly
  void start() {
    entry1 = new Entry(6.0f);
    entry2 = new Entry(Symbol.TIMES);
    entry3 = new Entry("hello");
  }

  @Test
  // Test 0 - Created the entry class
  void test() {
    Entry entry = new Entry(1.0f);
  }

  @Test
  // Test 1 - Created the method getType() and returned type.NUMBER.
  void testGetType() {
    assertEquals(entry1.getType(), Type.NUMBER, "The type of this entry should by NUMBER");
  }

  @Test
  // Test 2 - Created getValue() which included an exception to ensure that "type" is float
  void testGetValueBad() {
    assertThrows(BadTypeException.class, () -> {
      entry3.getValue();
    });
  }

  @Test
  // Test 3 - Set value of "number" in constructor to 6.0f and made getValue() return 6.0f
  void testGetValue() throws BadTypeException {
    assertEquals(entry1.getValue(), 6.0f, 0.001f);
  }

  @Test
  // Test 4 - Made getString() which throws an exception if "type" isn't a String
  void testGetStringBad() {
    assertThrows(BadTypeException.class, () -> {
      entry2.getString();
    });
  }

  @Test
  // Test 5 - Made getString() return "hello"
  void testGetString() throws BadTypeException {
    assertEquals(entry3.getString(), "hello", "The string returned should be hello");
  }

  @Test
  // Test 6 - Made getSymbol() to throw an exception if "type" isn't a Symbol
  void testGetSymbolBad() {
    assertThrows(BadTypeException.class, () -> {
      entry1.getSymbol();
    });
  }

  @Test
  // Test 7 - Made getSymbol() return Symbol.TIMES
  void testGetSymbol() throws BadTypeException {
    assertEquals(entry2.getSymbol(), Symbol.TIMES,
        "The value returned should be the symbol of the entry");
  }

  @Test
  // Test 8 - Used a variable named "number" from constructor, returned this variable not 6.0f
  void testGetValueOfTwo() throws BadTypeException {
    assertEquals(entry1.getValue(), 6.0f, 0.001f);
    Entry entry = new Entry(7.0f);
    assertEquals(entry.getValue(), 7.0f, 0.001f);
  }

  @Test
  // Test 9 - Used a variable called "myString" from constructor and returned it instead of "hello"
  void testGetStringOfTwo() throws BadTypeException {
    assertEquals(entry3.getString(), "hello", "The string returned should be hello");
    Entry entry = new Entry("testing");
    assertEquals(entry.getString(), "testing", "The string returned should be testing");
  }

  @Test
  // Test 10 - Returned the variable "type" instead of Type.NUMBER
  void testGetTypeOfTwo() {
    assertEquals(entry1.getType(), Type.NUMBER, "The type of this entry should be NUMBER");
    assertEquals(entry2.getType(), Type.SYMBOL, "The type of this entry sohuld be Symbol");
  }

  @Test
  // Test 11 - Returned "symbol" instead of Symbol.times;
  void testGetTwoSymbols() throws BadTypeException {
    assertEquals(entry2.getSymbol(), Symbol.TIMES, "The symbol returned should be TIMES");
    Entry entry = new Entry(Symbol.DIVIDE);
    assertEquals(entry.getSymbol(), Symbol.DIVIDE, "The symbol returned should be DIVIDE");
  }

  @Test
  // Test 12 - Implemented hashCode() and equals() method
  void testEquals() {
    Entry entry = new Entry(6.0f);
    assertEquals(entry1.equals(entry), true);
  }
}
