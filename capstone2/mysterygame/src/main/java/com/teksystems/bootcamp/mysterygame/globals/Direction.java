package com.teksystems.bootcamp.mysterygame.globals;

public enum Direction { // TODO: refactor to words? have chars as alt. keywords
    NORTH,
    EAST,
    SOUTH,
    WEST,
    ;

    Direction() {
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
