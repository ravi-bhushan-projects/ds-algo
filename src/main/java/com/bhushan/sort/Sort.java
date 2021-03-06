package com.bhushan.sort;

public interface Sort {
    void sort(int[] ar);
    
    default void swap(int[] ar, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
