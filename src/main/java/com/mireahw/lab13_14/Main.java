package com.mireahw.lab13_14;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.show();

        Controller controller = fxmlLoader.getController();
        controller.canvas.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                Controller.horCell = (int)(event.getX() / 100);
                Controller.vertCell = (int)(event.getY() / 100);
                System.out.println(Controller.horCell);
                System.out.println(Controller.vertCell);

            }
        });


    }

    public static void main(String[] args) {
        launch();
    }
}