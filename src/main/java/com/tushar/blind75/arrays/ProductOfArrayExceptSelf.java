package com.tushar.blind75.arrays;

import java.util.*;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

       int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }


        return result;
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{5,7,2,4})));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end - start) / 1_000_000);
        System.out.println("Space(KB): " + (afterMemory - beforeMemory) / 1024);
    }
}
