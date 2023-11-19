package org.example;
/* https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void checkAnagramStrings(){

        Anagram an = new Anagram();

        String str1 = "gram";
        String str2 = "arm";
        assertFalse(an.isAnagram(str1, str2));

        str1 = "rat"; str2 = "car";
        assertFalse(an.isAnagram(str1, str2));

    }



}