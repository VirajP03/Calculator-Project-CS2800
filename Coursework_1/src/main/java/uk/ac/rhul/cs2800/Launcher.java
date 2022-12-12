// File name: $HeadURL: https://svn.cs.rhul.ac.uk/personal/dave/CS2800Examples/MVC-separated/trunk/src/main/java/calculator/cs2800/Launcher.java $
// Revision: $Revision: 184 $
// Last modified: $Date: 2020-08-06 13:58:04 +0100 (Thu, 06 Aug 2020) $
// Last modified by: $Author: dave $
package uk.ac.rhul.cs2800;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * @author dave
 * 
 *         This class is used to start the JavaFX framework.
 *
 */
public class Launcher extends Application {

  /**
   * Used to pass information into main since JavaFX requires a specified signature for main the
   * method.
   */
  private static ControllerInterface myController;

  /**
   * The entry point to begin the JavaFX framework.
   * 
   * @param c the controller that needs to be notified once the View is created
   * @param args the arguments to actual main method in the Driver
   */
  public static void startJavaFX(ControllerInterface c, String[] args) {
    myController = c;
    Launcher.main(args);
  }

  /**
   * A callback for JavaFX when the toolkit is initialised. Used to instantiate the scene, create
   * the View and get the CSS.
   * 
   * @param primaryStage the stage to attach the newly create scene.
   */
  @Override
  public void start(Stage primaryStage) {
    FXMLLoader loader;

    loader = new FXMLLoader(Driver.class.getResource("/GuiConfig.fxml"));

    Scene scene = null;
    try {
      scene = new Scene(loader.load(), 400, 400);
    } catch (IOException e) {
      // Do Nothing - there is nothing to be done.
      e.printStackTrace();
    }
    myController.addView(loader.getController());
    //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * The main method needed by JavaFX in the Application class.
   * 
   * @param args the args passed into the true main method in Driver
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
}
