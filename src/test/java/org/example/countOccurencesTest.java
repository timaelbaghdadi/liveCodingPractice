package org.example;

import org.junit.jupiter.api.Test;
import org.example.countOccurences;

import static org.junit.jupiter.api.Assertions.*;

class countOccurencesTest {

    @Test
    public void checkCountOccurences(){
        countOccurences co = new countOccurences();

        int[] arr = new int[]{1, 1, 2, 2, 2, 2, 3};
        assertEquals(4, co.countOccurences(arr, 0, arr.length-1, 2));

        assertEquals(1, co.countOccurences(arr, 0, arr.length-1, 3));

        assertEquals(2, co.countOccurences(arr, 0, arr.length-1, 1));

        assertEquals(-1, co.countOccurences(arr, 0, arr.length-1, 4));
    }
}