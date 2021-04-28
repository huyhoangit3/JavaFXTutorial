package org.hoangit3.layouts.hbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button button5 = new Button("Button5");
        Button button6 = new Button("Button6");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        Scene root = new Scene(hBox, 300, 200);
        primaryStage.setScene(root);
        primaryStage.setTitle("HBox layout pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
