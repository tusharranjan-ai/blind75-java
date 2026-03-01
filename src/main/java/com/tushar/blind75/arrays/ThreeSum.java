package com.tushar.blind75.arrays;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        //{-1,0,1,2,-1,-4})

        Arrays.sort(nums);
        //{-4,-1,0,1,2}
        //{-2,-2,0,0,2,2}
        for(int i =0; i<nums.length-2 ; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length -1;

            while (left<right) {
                int threeSum = nums[i] + nums[left] + nums[right];

                if (threeSum > 0) {
                    right--;
                } else if (threeSum < 0) {
                    left++;
                } else {
                    resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {

        ThreeSum sol = new ThreeSum();

        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        long start = System.nanoTime();

        System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4}));

        long end = System.nanoTime();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time(ms): " + (end-start)/1_000_000);
        System.out.println("Space(KB): " + (afterMemory-beforeMemory)/1024);
    }
}
