package Week2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.EventListener;
import java.util.LinkedList;

public class Opdracht_20_2 extends Application {
    private LinkedList<Integer> list;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        TextField textField = new TextField();
        TextArea textArea = new TextArea();

        Button addButton = new Button("Add");
        Button sortButton = new Button("Sort");
        Button shuffleButton = new Button("Shuffle");
        Button reverseButton = new Button("Reverse");

        list = new LinkedList<>();

        HBox hboxTop = new HBox(10, new Label("Enter a number: "), textField, addButton);
        HBox hboxButtom = new HBox(10, sortButton, shuffleButton, reverseButton);

        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){
                list.add(Integer.parseInt(textField.getText()));

                String newNumber = "";
                for (Integer integer : list) {
                    newNumber += integer + " ";
                }
                textArea.setText(newNumber);

                textField.setText("");
            }
        });

        addButton.setOnAction(event -> {
            list.add(Integer.parseInt(textField.getText()));

            String newNumber = "";
            for (Integer integer : list) {
              newNumber += integer + " ";
            }
            textArea.setText(newNumber);

            textField.setText("");
        });

        sortButton.setOnAction(event -> {
            Collections.sort(list);

            String newNumber = "";
            for (Integer integer : list) {
                newNumber += integer + " ";
            }
            textArea.setText(newNumber);
        });

        shuffleButton.setOnAction(event -> {
            Collections.shuffle(list);

            String newNumber = "";
            for (Integer integer : list) {
                newNumber += integer + " ";
            }
            textArea.setText(newNumber);
        });

        reverseButton.setOnAction(event -> {
            Collections.reverse(list);

            String newNumber = "";
            for (Integer integer : list) {
                newNumber += integer + " ";
            }
            textArea.setText(newNumber);
        });

        borderPane.setTop(hboxTop);
        borderPane.setBottom(hboxButtom);
        borderPane.setLeft(textArea);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Exercise 20.2");
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.show();
    }
}
