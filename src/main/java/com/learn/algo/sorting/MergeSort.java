package com.learn.algo.sorting;


/**
 * @author Administrator
 */
public class MergeSort {
    public static void mergeSort(int[] array) {
        // Starting
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[array.length];
        int rightTmp = mid + 1;
        int tIndex = left;
        int cIndex = left;

        while(left <= mid && rightTmp <= right) {
            if(array[left] <= array[rightTmp]) {
                tmp[tIndex ++] = array[left ++];
            } else {
                tmp[tIndex ++] = array[rightTmp ++];
            }
        }

        while(left <= mid) {
            tmp[tIndex ++] = array[left ++];
        }

        while(rightTmp <= right) {
            tmp[tIndex ++] = array[rightTmp ++];
        }

        while(cIndex <= right) {
            array[cIndex] = tmp[cIndex];
            cIndex ++;
        }
    }
}
