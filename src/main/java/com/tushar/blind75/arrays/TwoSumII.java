package com.tushar.blind75.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public int[] twoSumTwo(int[] numbers, int target) {

        int start =0;
        int end =numbers.length-1;

        while (start < end){
            int sum = numbers[start] + numbers[end];

            if(sum > target){
                end --;
            }else if(sum < target){
                start ++;
            }else {
                return new int[]{start+1,end+1};
            }

        }

        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSumII sol = new TwoSumII();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.twoSumTwo(new int[]{2,7,11,15},9)));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
