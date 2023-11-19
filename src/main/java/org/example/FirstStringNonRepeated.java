package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstStringNonRepeated {

    public FirstStringNonRepeated() {
    }

    public Character getFirstStringNonRepeated(String s) {

        if (s.isEmpty()) {
            return null;
        }

        Map<Character, Integer> uniqueCharacters = new LinkedHashMap<>();

        AlternatingCharacters.getFrequencyPerUniqueChar(s, uniqueCharacters);

        for (Character c : uniqueCharacters.keySet()) {
            if (uniqueCharacters.get(c) == 1) {
                return c;
            }
        }

        return null;

    }
}
