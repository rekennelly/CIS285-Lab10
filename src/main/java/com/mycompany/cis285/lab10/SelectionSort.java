/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cis285.lab10;

/**
 *
 * @author kennelra
 */
public class SelectionSort {
    private int temp;

    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * pre-condition:
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
 */
     public int[] basicSelectionSort(int[] x) {
         int n = x.length;
         for (int start = 0; start < n - 1; start++) {
             int min = x[start];
             int minIndex = start;

             for (int j = start + 1; j < n; j++) {
                 if (x[j] < min) {
                     min = x[j];
                     minIndex = j;
                 }
             } // end of inner for loop

             int temp = min;
             x[minIndex] = x[start];
             x[start] = temp;
         } // end of outer for loop
         return x;
     } // end of basicSelectionSort method
}
