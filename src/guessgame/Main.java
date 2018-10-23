package guessgame;

import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane lemon = FXMLLoader.load(getClass().getResource("/guessgame/Main.fxml"));


        Scene apple = new Scene(lemon, 500, 300);
        primaryStage.setTitle("Cows And Bulls");
        primaryStage.setScene(apple);
        primaryStage.show();
    }
}


//       Pane lemon = new VBox();
//
////        Button melon = new Button("Hello");
//        Label orange = new Label("its a JFX");
//        TextField plum = new TextField();
//
//        orange.textProperty().bind(Bindings.concat(("Hello, "), plum.textProperty(), "!"));
////        melon.setOnAction(e -> {
////            orange.setText("Hello, " + plum.getText() + "!");
////        });
//
//        lemon.getChildren().addAll(plum, orange);

