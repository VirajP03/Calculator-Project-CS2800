// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/OpType.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $
package uk.ac.rhul.cs2800;

/**
 * The ways in a which a calculator may evaluate an arithmetic expression
 * 
 * @author dave
 *
 */
public enum OpType {
  /**
   * Normal order with operator between arguments like 5 * (3 + 2)
   */
  INFIX,
  /**
   * Reverse Polish like 325+*
   */
  POSTFIX;
}
