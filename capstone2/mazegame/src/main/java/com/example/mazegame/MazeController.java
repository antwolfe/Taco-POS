package com.example.mazegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class MazeController {
    @FXML
    private ImageView userSprite;
    private ImageView maze;


    @FXML
    public void up(ActionEvent event) {
        circle.setCenterY(y-=10);
    }

}