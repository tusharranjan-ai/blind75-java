package com.tushar.blind75.strings;

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        // TODO: Implement

        return false;
    }

    public static void main(String[] args) {

        ValidAnagram sol = new ValidAnagram();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.isAnagram("anagram","nagaram"));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
