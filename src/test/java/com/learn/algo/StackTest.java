package com.learn.algo;

import com.learn.algo.datatype.impl.LinkedListStack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void testLinkedListStack() {
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();

        for(int i = 0; i < 100; i ++) {
            stack.push(i);
        }

        Assert.assertEquals(100, stack.size());

        for(int i = 0; i < 100; i ++) {
            int check = stack.pop();
            Assert.assertEquals(99 - i, check);
        }

        Assert.assertEquals(0, stack.size());
    }
}
