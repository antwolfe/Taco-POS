package com.teksystems.bootcamp.mysterygame.gameobjects.rooms;

import com.teksystems.bootcamp.mysterygame.gameobjects.interactives.Clue;
import com.teksystems.bootcamp.mysterygame.gameobjects.interactives.InteractiveItem;

import java.util.ArrayList;

public class Room {
    private final String name, description;
    private final int n, e, s, w;
    private final ArrayList<Clue> clues;
    private final ArrayList<InteractiveItem> items;


    public Room(String name, String description, int n, int e, int s, int w, ArrayList<InteractiveItem> roomItems) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
        this.clues = new ArrayList<>();
        this.items = roomItems; // moot if in constructor
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

    public ArrayList<Clue> getCluesInRoom() {
        ArrayList<Clue> clues = new ArrayList<>();
        for (InteractiveItem roomItem : this.getItems()) {
            clues.addAll(roomItem.getClues());
        }
        return clues;
    }

    public ArrayList<InteractiveItem> getItems() {
        return items;
    }


}
