package com.tushar.blind75.strings;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        // TODO: Implement

        return 0;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters sol = new LongestSubstringWithoutRepeatingCharacters();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
