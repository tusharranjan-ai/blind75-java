package com.tushar.blind75.arrays;

import java.util.*;

public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {

        // [7,1,5,3,6,4]
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices){
            if(price < minPrice){
                minPrice =price;
            }else{
                maxProfit = Math.max(maxProfit, price -minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        BestTimeToBuySellStock sol = new BestTimeToBuySellStock();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
