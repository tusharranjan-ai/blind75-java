package com.tushar.blind75.arrays;

import java.util.*;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        // TODO: Implement

        return 0;
    }

    public static void main(String[] args) {

        ContainerWithMostWater sol = new ContainerWithMostWater();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
