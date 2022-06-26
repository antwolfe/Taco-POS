package gameobjects.game;

import gameobjects.rooms.*;

import java.util.ArrayList;


public class Game {
    private ArrayList<Room> map = new ArrayList<>();
    public ArrayList<String> commands = new ArrayList<>();

    public void playGame() {

        map.add(new Room("Backyard", "Where the BBQ is taking place", -1, -1, 1, -1));
        map.add(new Room("Kitchen", "Delicious sides line the counters and island", 0, 2, -1, 3));
        map.add(new Room("Cellar", "Damp and dark, what could possibly be in here?", -1, -1, -1, 1));
        map.add(new Room("Hallway", "Warm and cozy, looks like a good place to watch for suspects", 4, -1, -1, -1));
        map.add(new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1));

        for (Room room:map
             ) {
            System.out.println(room.getName());
        }

   }

}
