package com.tushar.blind75.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenationArrays {

    public int[] getConcatenation(int[] nums) {
        int[] concatArray = new int[nums.length*2];

        for(int i =0; i< nums.length;i++){
            concatArray[i] = nums[i];
            concatArray[i+nums.length] = nums[i];
        }

        return concatArray;
    }

    public static void main(String[] args) {

        ConcatenationArrays sol = new ConcatenationArrays();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.getConcatenation(new int[]{2,7,11,15})));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
