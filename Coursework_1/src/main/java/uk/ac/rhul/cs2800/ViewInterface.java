// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/ViewInterface.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

import java.util.function.Consumer;

/**
 * How we want to interact with our calculator. Just defines the data and provides hooks for
 * notification and insertion of observers.
 * 
 * @author dave
 *
 */
public interface ViewInterface {

  /**
   * Add an observer of the calculate action.
   * 
   * @param f the observer
   */
  void addCalcObserver(Observer f);

  /**
   * Add an observer of the calculate mode change action.
   * 
   * @param l the observer
   */
  void addTypeObserver(Consumer<OpType> l);

  /**
   * A hook to get the arithmetic expression to be evaluated.
   * 
   * @return the expression
   */
  String getQuestion();

  /**
   * A hook to show the user the evaluated answer.
   * 
   * @param a the answer
   */
  void setAnswer(String a);
}
