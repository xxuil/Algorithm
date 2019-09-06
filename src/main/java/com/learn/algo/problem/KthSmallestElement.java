package com.learn.algo.problem;

import com.learn.algo.sorting.MergeSort;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class KthSmallestElement {
    /**
     * O(N Log N) complexity
     * Using merge sort, heap sort, etc to solve
     */
    public static int methodOne(int k, int[] array) {
        int index = k - 1;
        MergeSort.mergeSort(array);
        return array[index];
    }

    /**
     * Using Heap to solve
     */
    public static int methodTwo(int k, int[] array) {
        return 0;
    }


    /**
     * Constraints :
     * 1 <= T <= 100
     * 1 <= N <= 10^5
     * 1 <= array[i] <= 10^5
     * 1 <= K <= N
     */
    public static void main(String[] args) {
        int[] arrayOne = {7, 10, 4, 3, 20, 15};
        int[] arrayTwo = {};
        int k = 3;
    }
}
