package com.bhushan.sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] ar) {
        if (ar.length == 1) {
            return;
        }
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < ar.length; firstUnsortedIndex++) {
            int newElement = ar[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && ar[i - 1] > newElement; i--) {
                ar[i] = ar[i - 1];
            }
            ar[i] = newElement;
        }
    }
}
