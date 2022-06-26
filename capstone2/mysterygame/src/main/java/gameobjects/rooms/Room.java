package gameobjects.rooms;

import gameobjects.characters.Actor;
import globals.Clue;
import globals.InteractiveItem;

import java.util.ArrayList;

public class Room {
    private final String name, description;
    private final int n, e, s, w;
    private ArrayList<Clue> clues;
    private ArrayList<Actor> characters;
    private ArrayList<InteractiveItem> items;


    public Room(String name, String description, int n, int e, int s, int w) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
        this.characters = new ArrayList<Actor>();
        this.clues = new ArrayList<Clue>();
        this.items = new ArrayList<InteractiveItem>();
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    public int getW() {
        return w;
    }

    public int getE() {
        return e;
    }

    public ArrayList<Clue> getClues() {
        return clues;
    }

    public void setClues(ArrayList<Clue> clues) {
        this.clues = clues;
    }

    public ArrayList<Actor> getCharacters() {
        return characters;
    }

    public void setCharacters(Actor characters) {
        this.characters.add(characters);
    }

    public ArrayList<InteractiveItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<InteractiveItem> items) {
        this.items = items;
    }
}
