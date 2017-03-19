package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sample.controller.mainController;
import sample.model.Game;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Game game = new Game();
        primaryStage.setTitle("Gry Karciane");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = loader.load();
        mainController mainController = loader.getController();
        mainController.setGame(game);
        mainController.printGame();
        Scene scene = new Scene(root, 300, 400);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, mainController::keyPress);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


    }
