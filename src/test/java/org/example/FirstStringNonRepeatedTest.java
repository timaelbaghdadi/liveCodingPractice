package org.example;
import org.example.FirstStringNonRepeated;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstStringNonRepeatedTest {

    @Test
    public void checkFirstNonRepeatedCharacter(){
        FirstStringNonRepeated test = new FirstStringNonRepeated();
        assertNull(test.getFirstStringNonRepeated(""));
    }







}