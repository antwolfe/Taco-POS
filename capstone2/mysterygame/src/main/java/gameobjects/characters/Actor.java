package gameobjects.characters;

import gameobjects.rooms.Room;

public class Actor {
    private String name;
    private String occupation;
    private String description;
    private boolean hasAlibi;
    private Room currentRoom;

    public Actor(String name, String occupation, String description, boolean hasAlibi) {
        this.name = name;
        this.occupation = occupation;
        this.description = description;
        this.hasAlibi = hasAlibi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasAlibi() {
        return hasAlibi;
    }

    public void setHasAlibi(boolean hasAlibi) {
        this.hasAlibi = hasAlibi;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public void LookRoom() {
        System.out.println("You are in the " + currentRoom.getName()
                + ". It is " + currentRoom.getDescription() + ".");
        // It has <Items>, do you want to look at any items?
    }

    private void LookItem() {
        //add items to rooms
    }

}
