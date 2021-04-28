package org.hoangit3.first_program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstProgram extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button();
        button1.setText("Click me");
        button1.setOnAction(event -> System.out.println("Button 1 clicked."));
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button1);
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First JavaFX program");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
