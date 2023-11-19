package org.example;

import java.util.HashSet;
import java.util.Set;

public class SubArray {

    public SubArray(){}

    public boolean findSubArraySum0(int[] arr) {

        Set<Integer> s = new HashSet<>();
        int sum = 0;

        for (int j : arr) {
            sum += j;
            if (s.contains(sum)) {
                return true;
            }

            s.add(sum);
        }

        return false;
    }
}
