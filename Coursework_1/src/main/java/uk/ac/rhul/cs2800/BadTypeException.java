package uk.ac.rhul.cs2800;

/**
 * This class is used to create an exception that inherits the Exception class that is used within
 * entry.
 *
 * @author Viraj Patel (zkac174)
 *
 */
public class BadTypeException extends Exception {

  private String errorString;

  public BadTypeException(String string) {
    errorString = string;
  }

}
