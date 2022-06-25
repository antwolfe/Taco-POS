package gameobjects.rooms;

import java.util.ArrayList;

public abstract class Room {
    private String name, description;
    private int n, s, w, e;
    private ArrayList<Clue> clues;
    private ArrayList<Character> characters;
    private ArrayList<GameItem> items;
    public Room(String name, String description, int n, int s, int w, int e) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.s = s;
        this.w = w;
        this.e = e;
    }
}
