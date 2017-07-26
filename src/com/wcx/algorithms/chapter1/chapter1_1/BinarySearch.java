package com.wcx.algorithms.chapter1.chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by wcx on 16-4-26.
 */
public class BinarySearch {
    public static int binSearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int indexOf(int[] a, int key) {
        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 5, 7, 8, 9, 23, 34, 56, 98};
//        int result = binSearch(a, 34);
//        System.out.print(result);
//    }

    public static void main(String[] args) {
        args[0] = "tinyW.txt";
        // read the integers from a file
        In in = new In(args[0]);

        int[] whitelist = in.readAllInts();
        StdOut.println(whitelist.length);

        // sort the array
        Arrays.sort(whitelist);
        int w = StdIn.readInt();
        StdOut.println(w);
        // read integer key from standard input; print if not in whitelist
        System.out.println("t" + StdIn.isEmpty());
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }
}