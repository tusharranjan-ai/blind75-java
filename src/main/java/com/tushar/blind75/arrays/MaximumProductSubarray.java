package com.tushar.blind75.arrays;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        // max = maximum product ending at current index
        int max = nums[0];

        // min = minimum product ending at current index
        // (important because negative * negative can become large positive)
        int min = nums[0];

        // result keeps track of the overall maximum product seen so far
        int result = nums[0];

        // start from second element because we initialized with nums[0]
        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            // If current number is negative, multiplying will flip signs
            // The max could become min and min could become max
            // So we swap them before calculating new values
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Decide whether to:
            // 1. start a new subarray from current number
            // 2. extend the previous maximum product
            max = Math.max(num, max * num);

            // Similarly track the smallest product
            // This might later turn into the largest if multiplied by negative
            min = Math.min(num, min * num);

            // Update the global maximum product
            result = Math.max(result, max);
        }

        return result;
    }

    public static void main(String[] args) {

        MaximumProductSubarray sol = new MaximumProductSubarray();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.maxProduct(new int[]{2,3,-2,4}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
