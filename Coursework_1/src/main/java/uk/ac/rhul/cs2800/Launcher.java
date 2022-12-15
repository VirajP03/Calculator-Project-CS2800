// File name: $HeadURL:
// https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Launcher.java
// $
// Revision: $Revision: 184 $
// Last modified: $Date: 2022-12-15 $
// Last modified by: $Author: Viraj Patel $

package uk.ac.rhul.cs2800;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * This class is used to start the JavaFX framework and calls the fxml to configure the GUI
 * correctly.
 *
 * @author dave and edited by Viraj Patel (zkac174)
 */
public class Launcher extends Application {

  /**
   * Used to pass information into main since JavaFX requires a specified signature for main the
   * method.
   */
  private static ControllerInterface myController;


  /**
   * A callback for JavaFX when the toolkit is initialised. Used to instantiate the scene, create
   * the View and get the CSS.
   *
   * @param primaryStage the stage to attach the newly create scene.
   */
  @Override
  public void start(Stage primaryStage) {
    myController = new Controller();
    FXMLLoader loader;

    loader = new FXMLLoader(getClass().getResource("/GuiConfig.fxml"));

    Scene scene = null;
    try {
      scene = new Scene(loader.load(), 400, 400);
    } catch (IOException e) {
      e.printStackTrace();
    }
    myController.addView(loader.getController());
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * The main method needed by JavaFX in the Application class.
   *
   * @param args the args passed into the true main method in Driver
   */
  public static void main(String[] args) {
    Application.launch();
  }
}
