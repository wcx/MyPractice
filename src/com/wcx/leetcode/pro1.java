package com.wcx.leetcode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wcx on 17-7-20.
 */
public class pro1 {
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        File path = new File("/home/wcx/Development/IdeaProjects/MyPractice/src/com/wcx/algorithms/chapter1/chapter1_1/largeT.txt");
        System.out.println(path.getAbsolutePath());
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String s;
            while ((s = in.readLine()) != null) {
                list.add(Integer.parseInt(s.trim()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] b = new int[list.size()];
        b = list.stream().mapToInt(i -> i).toArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10, 151, 165, 177, 188};
        int[] r = twoSum1(b, 942885);
        for (int i : r
                ) {
            System.out.printf(String.valueOf(i) + "\n");
        }

    }
}
