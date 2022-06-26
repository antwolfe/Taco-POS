package gameobjects.characters;

import gameobjects.rooms.Room;

public class Player extends Actor {


    public Player(String name, String occupation, String description, boolean hasAlibi) {
        super(name, occupation, description, hasAlibi);
        this.currentRoom = getCurrentRoom();
    }


    public void LookRoom() {
        System.out.println("You are in the " + currentRoom.getName()
                + ". It is " + currentRoom.getDescription() + ".");
        // It has <Items>, do you want to look at any items?
    }

    public void LookItem() {
        //add items to rooms
    }
}
