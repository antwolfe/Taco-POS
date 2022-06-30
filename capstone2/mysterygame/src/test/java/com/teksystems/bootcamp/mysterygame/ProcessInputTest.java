package com.teksystems.bootcamp.mysterygame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


class ProcessInputTest {


    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest
    @ValueSource(strings = { "look room go", "go s north", "jack" })
    void commandsShouldBeTwoWords(String command) {
        assertFalse(InputValidator.isValidCommand(command));
    }

    @ParameterizedTest
    @ValueSource(strings = { "no shot", "run game", "have coffee"})
    void invalidCommandsShouldReturnFalse(String command) {
        assertFalse(InputValidator.isValidCommand(command));
    }






//    @Test
//    void isValidCommandTest() {
//        String command = "look room";
//        boolean expected = true;
//        boolean actual = gameInput.isValidCommand(command);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void isValidCommandTest2() {
//        String command = "go s";
//        boolean expected = true;
//        boolean actual = gameInput.isValidCommand(command);
//        assertEquals(expected, actual);
//    }

    @Test

    void processLookCommand() {
    }

    @Test

    void processGoCommand() {
    }

    @Test

    void processTakeCommand() {
    }

    @Test

    void processExamineCommand() {
    }

    @Test
    void processCommands() {
    }
}