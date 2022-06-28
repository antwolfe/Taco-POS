package com.teksystems.bootcamp.mysterygame.gameobjects;

import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Map {

    private static final HashMap<String, Room> map = new HashMap<>();

    public Map() {
        createMap();
    }

    private void createMap() {
        Room backyard = new Room("Backyard", "where the BBQ is taking place", -1, 4, 1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.BBQ_PIT, InteractiveItem.MAT)));
        Room kitchen = new Room("Kitchen", "where delicious sides line the counters and island", 0, 2, -1, 3, new ArrayList<>
                (Arrays.asList(InteractiveItem.FRIDGE, InteractiveItem.OVEN, InteractiveItem.COUNTER)));
        Room cellar = new Room("Cellar", "damp and dark, gives you the shivers", -1, -1, -1, 1, new ArrayList<>
                (Arrays.asList(InteractiveItem.TRASHCAN)));
        Room hallway = new Room("Hallway", "warm and cozy, looks like a good place to watch for suspects", 4, 1, -1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.MAT, InteractiveItem.TRASHCAN)));
        Room office = new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.COMPUTER, InteractiveItem.DESK)));

        map.put("Backyard", backyard);
        map.put("Kitchen", kitchen);
        map.put("Cellar", cellar);
        map.put("Hallway", hallway);
        map.put("Office", office);

    }

    public static HashMap<String, Room> getMap() { return map; }
}
