package com.learn.algo.sorting;

import org.junit.Assert;
import org.junit.Test;
import util.RandomIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {
    @Test
    public void testRandomArray() {
        int n = 100;
        int[] array = RandomIntArray.generate(n);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }

        int[] test = new int[n];

        for(int i = 0; i < n; i ++) {
            test[i] = list.get(i);
        }

        Assert.assertEquals(n, array.length);
        Arrays.sort(array);
        Assert.assertArrayEquals(test, array);
    }

    @Test
    public void testMergeSort() {
        int n = 10000;
        int[] array = RandomIntArray.generate(n);
        int[] compare = array.clone();
        Arrays.sort(compare);

        MergeSort.mergeSort(array);
        Assert.assertArrayEquals(compare, array);
    }
}
