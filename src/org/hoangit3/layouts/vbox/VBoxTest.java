package org.hoangit3.layouts.vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(label1, label2);

        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox layout pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
