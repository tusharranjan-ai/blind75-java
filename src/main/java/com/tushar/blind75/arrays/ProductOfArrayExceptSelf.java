package com.tushar.blind75.arrays;

import java.util.*;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        // TODO: Implement

        return new int[]{};
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{1,2,3,4})));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
