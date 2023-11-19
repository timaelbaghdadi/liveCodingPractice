package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

    public Anagram(){}
    public boolean isAnagram(String str1, String str2) {

        // Get lengths of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same, then they
        // cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both the strings
        Arrays.sort(str1.toCharArray());
        Arrays.sort(str2.toCharArray());


        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1.charAt(i) != str2.charAt(i))
                return false;

        return true;

    }
}
