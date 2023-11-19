package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectedValues {

    public IntersectedValues(){}

    public List<Integer> findIntersectedValues(int[] arr1, int[] arr2) {

        List<Integer> repeatedValues = new ArrayList<>();
        Set<Integer> uniqueValuesArr1 = new HashSet<>();

        int[] var4 = arr1;
        int var5 = arr1.length;

        int var6;
        Integer k;
        for(var6 = 0; var6 < var5; ++var6) {
            k = var4[var6];
            uniqueValuesArr1.add(k);
        }

        var4 = arr2;
        var5 = arr2.length;

        for(var6 = 0; var6 < var5; ++var6) {
            k = var4[var6];

            if (uniqueValuesArr1.contains(k)) {
                repeatedValues.add(k);
            }
        }

        return repeatedValues;
    }
}
