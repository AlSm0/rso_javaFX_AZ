package com.example.rso_java_az;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Display extends Parent {
    private TextField TextField;
    private Button add;
    private Button remove;
    private Label label;
    private ListView<String> ListView;
    private ObservableList<String> Items;
    private int selectedItem = -1;

    public Display(){
        this.TextField = new TextField();
        this.add = new Button("add");
        this.remove = new Button("remove");
        this.label = new Label();
        this.ListView = new ListView<>();
        this.Items = FXCollections.observableArrayList();

        ListView.setItems(Items);

        ListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if(newSelection != null){
                String selectedText = newSelection.toString();
                selectedItem = ListView.getSelectionModel().getSelectedIndex();
                System.out.println("Selected item: " + selectedText);
                System.out.println("Selected inbox: " + selectedItem);
            }
        });
    }

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
