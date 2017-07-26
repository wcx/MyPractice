package com.wcx.algorithms.chapter1.chapter1_3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wcx on 17-6-28.
 */
public class Stats {
    public static void main(String[] args) {
        Bag<Double> nums = new Bag<Double>();

        while (!StdIn.isEmpty()) {
            nums.add(StdIn.readDouble());
            StdOut.printf(String.valueOf(nums.size()) + "\n");

        }
        StdOut.printf("a");
        int N = nums.size();
        double sum = 0.0;
        for (double x : nums) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : nums) {
            sum += (x - mean) * (x - mean);

        }
        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Mean:    %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }

}
