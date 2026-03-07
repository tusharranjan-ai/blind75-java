package com.tushar.blind75.arrays;

import java.util.*;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        //Kadane’s Algorithm
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for (int num : nums){
            currentSum +=num;
            maxSum = Math.max(maxSum,currentSum);
            // Drop the sum if it becomes negative
            if(currentSum <0){
                currentSum =0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        MaximumSubarray sol = new MaximumSubarray();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
