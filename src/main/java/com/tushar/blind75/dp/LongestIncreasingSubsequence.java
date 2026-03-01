package com.tushar.blind75.dp;

import java.util.*;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        // TODO: Implement

        return 0;
    }

    public static void main(String[] args) {

        LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
