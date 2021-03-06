package com.bhushan.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private int[] unsorted;
    private int[] sorted;
    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        unsorted = new int[]{7, 2, 5, 1, 9, 3};
        sorted = new int[]{1, 2, 3, 5, 7, 9};
        bubbleSort = new BubbleSort();
    }

    @Test
    void sort() {
        bubbleSort.sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }
}
