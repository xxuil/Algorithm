package com.learn.algo.datatype.impl;

import com.learn.algo.datatype.Stack;

import java.util.Iterator;

/**
 * @author Xiangxing Liu
 */
public class LinkedListStack <T> implements Stack<T>, Iterable<T>{
    private Node first;
    private int size;

    public LinkedListStack() {
        first = null;
        size = 0;
    }

    /**
     * Push to the top
     *
     * @param element push element
     */
    public void push(T element) {
        Node n = new Node();
        n.element = element;
        n.next = first;
        first = n;
        size ++;
    }

    /**
     * Pop from the top
     *
     * @return element to pop
     */
    public T pop() {
        Node n = first;
        first = n.next;
        size --;
        return n.element;
    }

    /**
     * Find size
     *
     * @return size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * Check if empty
     *
     * @return if stack is empty
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<T> iterator() {
        return null;
    }

    private class Node{
        T element;
        Node next;
    }
}
