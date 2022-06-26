package globals;

public enum InteractiveItem {
    ROOM("It is a room with various items"),
    TRASHCAN("You know what they say about another's trash..."),
    DESK("A big desk with many drawers. There is a computer on top"),
    COMPUTER("A device for searching the internet"),
    OVEN("There seems to be some food in there"),
    COUNTER("You see a colorful magazine scattered amongst junk mail"),
    MAT("Weird marks on the mat. Looks like someone tracked in some dirt"),
    FRIDGE("You open the fridge and see lots of seasoned chicken ready for the grill"),
    BBQ_PIT("Fixed in small holes in the dirt. Lots of coals burning"),
    W("west"); // TODO: fix
    private final String description;


    InteractiveItem(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}


