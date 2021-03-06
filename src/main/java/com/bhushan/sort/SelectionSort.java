package com.bhushan.sort;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] ar) {
        for (int lastUnsortedIndex = ar.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxPos = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (ar[i] > ar[maxPos]) {
                    maxPos = i;
                }
            }
            swap(ar, maxPos, lastUnsortedIndex);
        }
    }
}
