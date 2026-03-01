package com.tushar.blind75.binary;

import java.util.*;

public class CountingBits {

    public int[] countBits(int n) {

        // TODO: Implement

        return new int[]{};
    }

    public static void main(String[] args) {

        CountingBits sol = new CountingBits();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(Arrays.toString(sol.countBits(5)));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
