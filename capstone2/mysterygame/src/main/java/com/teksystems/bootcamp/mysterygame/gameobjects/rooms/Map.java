package com.teksystems.bootcamp.mysterygame.gameobjects.rooms;

import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Map {

    private static final ArrayList<Room> map = new ArrayList<>();

    public Map() {
        createMap();
    }

    private void createMap() {
        Room backyard = new Room("Backyard", "where the BBQ is taking place", -1, 4, 1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.MAT, InteractiveItem.BBQ_PIT)));
        Room kitchen = new Room("Kitchen", "where delicious sides and other junk line the counters", 0, 2, -1, 3, new ArrayList<>
                (Arrays.asList(InteractiveItem.FRIDGE, InteractiveItem.COUNTER)));
        Room cellar = new Room("Cellar", "damp and dark, gives you the shivers", -1, -1, -1, 1, new ArrayList<>
                (Collections.singletonList(InteractiveItem.TRASHCAN)));
        Room hallway = new Room("Hallway", "warm and cozy, looks like a good place to watch for suspects", 4, 1, -1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.HALLWAY)));
        Room office = new Room("Office", "Your friend's office. Where the crime took place", -1, 0, 3, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.COMPUTER, InteractiveItem.DESK)));

        map.add(backyard);
        map.add(kitchen);
        map.add(cellar);
        map.add(hallway);
        map.add(office);

    }

    public static ArrayList<Room> getMap() { return map; }
}
