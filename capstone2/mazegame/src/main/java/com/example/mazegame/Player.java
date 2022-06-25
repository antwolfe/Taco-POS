package com.example.mazegame;

// states and behaviors for the player character in game

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Player {

    ImageView sprite;
    int playerPoints = 0;
    double playerX = 0;
    double playerY = 0;

    public Player(ImageView sprite) {
        this.sprite = sprite;
    }

    public static void moveUp(Pane layout) {
        System.out.println("move up");
    }
    public static void moveDown() {
        System.out.println("move down");
    }
    public static void moveRight() {
        System.out.println("move right");
    }
    public static void moveLeft() {
        System.out.println("move left");
    }


}
