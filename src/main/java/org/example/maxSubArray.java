package org.example;

public class maxSubArray {


    public maxSubArray(){}
    public void maxSubarraySum(int[] arr, int n) {

        int maxSum = 0;
        int[] cumSumArr = new int[arr.length];

        int i;
        for (i = 0; i < arr.length; ++i) {

            maxSum = maxSum + arr[i];
            cumSumArr[i] = maxSum;
        }

        maxSum = cumSumArr[0];

        for (i = 0; i < arr.length - n; ++i) {

            int i1 = cumSumArr[i + (n - 1)] - cumSumArr[i];

            if (i1 > maxSum) {
                maxSum = i1;
            }
        }
    }

}
