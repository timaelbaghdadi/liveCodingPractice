package org.example;

import java.util.Random;

public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 10, 3, 50, 3, 4, 7, 1, 2};

        quickSortAlgorithm(numbers, 0, numbers.length - 1);

    }

    public static void quickSortAlgorithm(int[] numbers, int lb, int ub) { // pass low index and high index

        if (lb >= ub) {
            return;
        }
        int pivot = numbers[ub];

        int leftPointer = lb;
        int rightPointer = ub;

        while (leftPointer < rightPointer) {
            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++; // increment leftPointer when leftPointer values is lower than pivot
            }
            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--; // decrease rightPointer when rightPointer value is higher than pivot
            }
            swap(numbers, leftPointer, rightPointer);
        }


        swap(numbers, leftPointer, ub);

        quickSortAlgorithm(numbers, lb, leftPointer - 1);
        quickSortAlgorithm(numbers, rightPointer + 1, ub);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
