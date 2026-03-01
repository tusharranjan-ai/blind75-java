package com.tushar.blind75.heap;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // TODO: Implement

        return new int[]{};
    }

    public static void main(String[] args) {

        TopKFrequentElements sol = new TopKFrequentElements();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3},2)));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
