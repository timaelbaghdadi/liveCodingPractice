package org.example;

import java.util.HashMap;
import java.util.Map;

public class AlternatingCharacters {

    public AlternatingCharacters() {
    }

    public Integer getMaxAlternatingCharacter(String s1) {

        Map<Character, Integer> uniqueLetters = new HashMap<>();

        getFrequencyPerUniqueChar(s1, uniqueLetters);

        int length = 0;
        String strNew = s1;
        if (uniqueLetters.size() >= 2) {
            for (Character letter : uniqueLetters.keySet()) {

                if (uniqueLetters.size() > 2) {
                    strNew = s1.replaceFirst(letter.toString(), "");/*O(n^2)*/
                }

                length = Math.max(checkSizeOfString(strNew), length);
            }
        }

        return length;

    }

    static void getFrequencyPerUniqueChar(String s1, Map<Character, Integer> uniqueLetters) {
        for (int i = 0; i < s1.length(); i++) {
            if (uniqueLetters.get(s1.charAt(i)) != null) {
                uniqueLetters.put(s1.charAt(i), uniqueLetters.get(s1.charAt(i)) + 1);
            }

            uniqueLetters.putIfAbsent(s1.charAt(i), 1);
        }
    }


    public Integer checkSizeOfString(String s) {

        Integer subLength = 0;
        Character prev = null;

        for (int i = 0; i < s.length(); i++) {

            if (prev == null || s.charAt(i) != prev) {
                prev = s.charAt(i);
                subLength++;
            } else {
                return 0;
            }

        }

        if (subLength >= 2) {
            return subLength;
        }

        return 0;
    }
}
