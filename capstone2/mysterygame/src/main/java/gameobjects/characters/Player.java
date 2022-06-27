package gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import gameobjects.rooms.Room;
import globals.Clue;
import globals.InteractiveItem;


public class Player extends Actor {


    public Player(String name, String occupation, String description, boolean hasAlibi) {
        super(name, occupation, description, hasAlibi);
        this.currentRoom = getCurrentRoom();
    }


    public void goDirection(int direction) {
        Room newRoom;
        String noRoom = "There is no room that way.";
        if (direction == -1) {
            System.out.println(noRoom);
        } else {
            newRoom = Game.getMap().get(direction);
            setCurrentRoom(newRoom);
            LookRoom();
        }
    }

    public void LookRoom() {
        System.out.println("You are in the " + currentRoom.getName()
                + ". It is " + currentRoom.getDescription() + ".");
        // It has <Items>, do you want to look at any items?
        System.out.println("It has: " + currentRoom.getItems());
    }

    public void LookItem(String item) {
        //add items to rooms
        for (InteractiveItem interItem : InteractiveItem.values()) {
            if (interItem.toString().toLowerCase().contains(item) && currentRoom.getItems().contains(interItem)) {
                System.out.println(interItem.getDescription());
            }
        }
    }

    public void examineItem(){}


    public void takeClue(Clue clue){
        // after examining item, clue will be exposed.
        // player will put clue into inventory
    }


}
