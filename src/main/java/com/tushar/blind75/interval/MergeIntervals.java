package com.tushar.blind75.interval;

import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        // TODO: Implement

        return new int[][]{};
    }

    public static void main(String[] args) {

        MergeIntervals sol = new MergeIntervals();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.deepToString(sol.merge(new int[][]{{1,3},{2,6},{8,10}})));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
