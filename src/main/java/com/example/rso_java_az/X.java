package com.example.rso_java_az;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class X extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    //--------------------------------------------------------------


    public void start(Stage stage) {

        HBox root = new HBox(20, makeNamePane());
        root.setPadding(new Insets(10));
        root.setStyle("-fx-border-color:black; -fx-border-width:2px");

        stage.setScene( new Scene(root) );
        stage.setTitle("Event handler");
        stage.show();

    }
    private BorderPane makeNamePane() {

        ObservableList<String> names = FXCollections.observableArrayList();
        ListView<String> listView = new ListView<String>(names);

        listView.setEditable(true);
        listView.setCellFactory(TextFieldListCell.forListView());

        BorderPane namePane = new BorderPane(listView);
        Label top = new Label("Events");
        top.setPadding( new Insets(10) );
        top.setFont( Font.font(20) );
        top.setTextFill(Color.CYAN);
        top.setMaxWidth(Double.POSITIVE_INFINITY);
        top.setAlignment(Pos.CENTER);
        top.setStyle("-fx-background-color: black");
        namePane.setTop(top);

        Label selectedNameLabel = new Label();
        selectedNameLabel.textProperty().bind(
                listView.getSelectionModel().selectedItemProperty().asString("SelectedItem: %s") );

        Button deleteNameButton = new Button("Delete");
        deleteNameButton.setMaxWidth(Double.POSITIVE_INFINITY);
        deleteNameButton.disableProperty().bind(
                listView.getSelectionModel().selectedIndexProperty().isEqualTo(-1) );
        deleteNameButton.setOnAction( e -> {
            int index = listView.getSelectionModel().getSelectedIndex();
            if (index >= 0)
                names.remove(index);
        });

        TextField addNameInput = new TextField();
        addNameInput.setPrefColumnCount(10);
        Button addNameButton = new Button("Add: ");
        addNameButton.setOnAction( e -> {
            String name = addNameInput.getText().trim();
            if (name.length() > 0) {
                names.add(name);
                addNameInput.selectAll();
                listView.scrollTo(names.size() - 1);
            }
        });
        addNameButton.defaultButtonProperty().bind( addNameInput.focusedProperty() );
        HBox addNameHolder = new HBox(5,addNameButton,addNameInput);

        VBox nameBot = new VBox(12, selectedNameLabel, deleteNameButton, addNameHolder );
        nameBot.setPadding(new Insets(10));
        namePane.setBottom(nameBot);

        return namePane;

    }
}