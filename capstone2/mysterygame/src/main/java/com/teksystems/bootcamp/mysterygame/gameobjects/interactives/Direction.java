package com.teksystems.bootcamp.mysterygame.gameobjects.interactives;

public enum Direction { // TODO: refactor to words? have chars as alt. keywords
    NORTH,
    EAST,
    SOUTH,
    WEST,
    ;

    Direction() {}

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
