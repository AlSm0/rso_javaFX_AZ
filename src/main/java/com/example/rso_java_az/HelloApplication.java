package com.example.rso_java_az;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Button b1 = new Button("Siema, utisny me");
        Scene scene = new Scene(root, 320, 240, Color.AQUA);
        stage.setTitle("Siema!");
        b1.setOnAction(e-> {
            System.out.println("o kurva");
        });
        b1.setLayoutX(100);
        b1.setLayoutY(150);
        root.getChildren().add(b1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}