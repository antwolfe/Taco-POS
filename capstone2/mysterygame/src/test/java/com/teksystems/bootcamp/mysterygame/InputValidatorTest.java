package com.teksystems.bootcamp.mysterygame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

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

}