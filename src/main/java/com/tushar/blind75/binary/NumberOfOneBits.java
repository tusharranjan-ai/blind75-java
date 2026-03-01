package com.tushar.blind75.binary;

import java.util.*;

public class NumberOfOneBits {

    public int hammingWeight(int n) {

        // TODO: Implement

        return 0;
    }

    public static void main(String[] args) {

        NumberOfOneBits sol = new NumberOfOneBits();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.hammingWeight(11));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
