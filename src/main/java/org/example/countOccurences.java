package org.example;
/* https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/ */

public class countOccurences {

    public countOccurences(){}

    public Integer binarySearch(int[] arr, Integer lb, Integer ub, Integer target) {

        if (ub < lb)
            return -1;

        int middle = (ub + lb) / 2;

        if (arr[middle] == target) {
            return middle;
        } else {
            if (arr[middle] < target) {
                return binarySearch(arr, middle + 1, ub, target);
            } else {
                return binarySearch(arr, lb, middle - 1, target);
            }
        }

    }

    public Integer countOccurences(int[] arr, Integer lb, Integer ub, Integer target) {
        if (arr.length == 0) {
            return -1;
        } else {
            int index = binarySearch(arr, lb, ub, target);

            if (index > -1){
                int occurence = 1;

                for(int left = index - 1; left >= 0 && arr[left] == target; --left) {
                    ++occurence;
                }

                for(int right = index + 1; right <= ub && arr[right] == target; ++right) {
                    ++occurence;
                }

                return occurence;
            }
            return -1;
        }
    }
}
