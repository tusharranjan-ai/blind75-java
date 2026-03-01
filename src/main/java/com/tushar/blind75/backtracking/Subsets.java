package com.tushar.blind75.backtracking;

import java.util.*;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        // TODO: Implement

        return new ArrayList<>();
    }

    public static void main(String[] args) {

        Subsets sol = new Subsets();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.subsets(new int[]{1,2,3}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
