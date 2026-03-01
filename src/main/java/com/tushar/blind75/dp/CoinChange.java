package com.tushar.blind75.dp;

import java.util.*;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        // TODO: Implement

        return 0;
    }

    public static void main(String[] args) {

        CoinChange sol = new CoinChange();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.coinChange(new int[]{1,2,5},11));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
