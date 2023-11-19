package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public LongestSubstring(){}

    public Integer findLongestSubstring(String s) {

        Map<Character, Integer> visitedCharacters = new HashMap<>();
        String output = "";
        int maxLength = 0;
        int right = 0;

        for(int left = 0; left < s.length(); ++left) {
            if (visitedCharacters.containsKey(s.charAt(left)) && left > right) {
                right = (Integer)visitedCharacters.get(s.charAt(left)) + 1;
            }

            if (output.length() < left - right) {
                output = s.substring(right, left);
                if(output.length() > maxLength){
                    maxLength = output.length();
                }
            }

            visitedCharacters.put(s.charAt(left), left);
        }

        return maxLength;
    }
}
