package com.bhushan.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {
    private Sort selectionSort;

    @BeforeEach
    void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    void sort() {
        int[] unsorted = new int[]{7, 2, 5, 1, 9, 3};
        int[] sorted = new int[]{1, 2, 3, 5, 7, 9};
        selectionSort.sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }
}
