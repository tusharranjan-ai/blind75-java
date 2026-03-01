package com.tushar.blind75.strings;

import java.util.*;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        // TODO: Implement

        return false;
    }

    public static void main(String[] args) {

        ValidPalindrome sol = new ValidPalindrome();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
