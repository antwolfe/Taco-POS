package gameobjects.rooms;

import java.util.ArrayList;

public class Room {
    private String name, description;
    private int n, s, w, e;
    private ArrayList<Clue> clues;
    private ArrayList<Character> characters;
    private ArrayList<GameItem> items;
}
