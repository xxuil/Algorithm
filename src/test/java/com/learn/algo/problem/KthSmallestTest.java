package com.learn.algo.problem;

import org.junit.Assert;
import org.junit.Test;

public class KthSmallestTest {
    @Test
    public void testKthSmallest() {
        int[] arrayOne = {7, 10, 4, 3, 20, 15};
        int[] arrayTwo = {};
        int k = 3;

        int res = KthSmallestElement.methodOne(k, arrayOne);
        Assert.assertEquals(7, res);
    }
}
