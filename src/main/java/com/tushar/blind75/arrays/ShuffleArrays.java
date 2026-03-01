package com.tushar.blind75.arrays;

import java.util.Arrays;

public class ShuffleArrays {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int start=0;
        int end = n;
        while (start<n){
            result[start*2] = nums[start];
            result[start*2+1] = nums[end];
            start++;
            end ++;
        }
        return result;

    }

    public static void main(String[] args) {

        ShuffleArrays sol = new ShuffleArrays();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.shuffle(new int[]{2,5,1,3,4,7},3)));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
