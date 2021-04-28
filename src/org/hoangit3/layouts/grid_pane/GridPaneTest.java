package org.hoangit3.layouts.grid_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lblUsername = new Label("UserName: ");
        Label lblPassword = new Label("Password: ");
        TextField txtUsername = new TextField();
        TextField txtPassword = new TextField();
        Button btnSubmit = new Button("Submit");

        GridPane gridPane = new GridPane();
        gridPane.addRow(0, lblUsername, txtUsername);
        gridPane.addRow(1, lblPassword, txtPassword);
        gridPane.addRow(2, btnSubmit);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane layout");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
