package com.learn.algo.datatype;

/**
 * @author Xiangxing Liu
 */
public interface Stack <T> {
    /**
     * Push to the top
     * @param element push element
     */
    void push(T element);

    /**
     * Pop from the top
     * @return element to pop
     */
    T pop();

    /**
     * Find size
     * @return size of the stack
     */
    int size();

    /**
     * Check if empty
     * @return if stack is empty
     */
    boolean isEmpty();
}
