package com.example.mazegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class GameController {
    @FXML
    private static ImageView playerSprite;



    public void moveRight(){
        System.out.println("PlayerSprite: " + playerSprite);
//        double currentLayoutX = playerSprite.getLayoutX();
//        System.out.println("LayoutX: " + currentLayoutX);
//        double currentX = playerSprite.getX();
//        System.out.println("X: " + currentX);

    }

}

