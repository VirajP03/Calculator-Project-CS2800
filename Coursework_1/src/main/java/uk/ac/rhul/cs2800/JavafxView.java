// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/JavafxView.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $

package uk.ac.rhul.cs2800;

import java.util.function.Consumer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * This is the JavaFX View that is filled by the fxml loader at runtime.
 * 
 * @author dave
 */
public class JavafxView implements ViewInterface {

  /**
   * This allows a new observer to be added to the change calculate strategy action.
   * 
   * @param f the Observer to be notified.
   */
  public void addCalcObserver(Observer f) {
    calcButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        f.tell();
      }
    });
  }

  /**
   * This allows a new observer to be added to the change calculate strategy action.
   * 
   * @param l the Observer to be notified.
   */
  public void addTypeObserver(Consumer<OpType> l) {
    type.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      @Override
      public void changed(ObservableValue<? extends Toggle> observable, Toggle from, Toggle to) {
        l.accept(to == infixButton ? OpType.INFIX : OpType.POSTFIX);
      }
    });
  }

  /**
   * A hook to expose the question to another class.
   * 
   * @return the arithmetic expression to be evaluated.
   */
  public String getQuestion() {
    return question.getText();
  }

  /**
   * A hook to allow the answer to be displayed.
   * 
   * @param a the evaluated answer.
   */
  public void setAnswer(String a) {
    answer.setText(a);
  }
  ///////////////////////////////////////////////////////////////////

  /**
   * The calculator button on the screen.
   */
  @FXML
  // fx:id="calcButton"
  private Button calcButton; // Value injected by FXMLLoader

  /**
   * One of a pair of buttons to change calculation mode.
   */
  @FXML
  // fx:id="infixButton"
  private RadioButton infixButton; // Value injected by FXMLLoader

  /**
   * the object that links the two radio buttons.
   */
  @FXML
  // fx:id="type"
  private ToggleGroup type; // Value injected by FXMLLoader

  /**
   * One of a pair of buttons to change calculation mode.
   */
  @FXML
  // fx:id="postfixButton"
  private RadioButton postfixButton; // Value injected by FXMLLoader

  /**
   * The expression to be resolved.
   */
  @FXML
  // fx:id="question"
  private TextField question; // Value injected by FXMLLoader

  /**
   * The place where the answer is displayed.
   */
  @FXML
  // fx:id="answer"
  private Label answer; // Value injected by FXMLLoader
}
