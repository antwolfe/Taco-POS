package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;

public abstract class Actor {
    private String name;
    private final String occupation;
    private final String description;
    protected Room currentRoom;

    public Actor(String name, String occupation, String description) {
        this.name = name;
        this.occupation = occupation;
        this.description = description;
    }

   public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }


}
