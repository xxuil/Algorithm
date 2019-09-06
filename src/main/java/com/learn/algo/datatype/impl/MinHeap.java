package com.learn.algo.datatype.impl;



/**
 * Array Implementation
 * A[i]             ==  element
 * A[(i - 1) / 2]   ==  parent
 * A[(2 * i) + 1]   ==  left
 * A[(2 * i) + 2]   ==  right
 * @author Xiangxing Liu
 */
public class MinHeap {
    private static final int FRONT = 1;

    private int[] heap;
    private int capacity;
    private int size;

    /**
     * Constructor
     */
    public MinHeap() {
        this.capacity = 7;
        this.size = 0;
        heap = new int[this.capacity + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    public void insert(int element) {
        if(size >= capacity) {
            return;
        }

        heap[++ size] = element;
        int current = size;

        while(heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return (2 * i);
    }

    private int right(int i) {
        return (2 * i) + 1;
    }

    private boolean isLeaf(int i) {
        return i >= (size / 2) && i <= size;
    }

    private void swap (int a, int b) {
        int temp;
        temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void heapify(int i) {
        if (!isLeaf(i)) {
            if (heap[i] > heap[left(i)] || heap[i] > heap[right(i)]) {
                if (heap[left(i)] < heap[right(i)]) {
                    swap(i, left(i));
                    heapify(left(i));
                } else {
                    swap(i, right(i));
                    heapify(right(i));
                }
            }
        }
    }
}
