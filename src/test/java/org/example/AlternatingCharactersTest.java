package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {

    @Test
    public void checkAlternatedChars(){
        AlternatingCharacters c = new AlternatingCharacters();

        assertEquals(2, c.getMaxAlternatingCharacter("ab"));
        assertEquals(5, c.getMaxAlternatingCharacter("beabeefeab"));
        assertEquals(6, c.getMaxAlternatingCharacter("acbdabcaeb"));

    }

}