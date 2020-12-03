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

         for (int i = 0; i < n - 1; i++) {
             int minIndex = i;
             for (int j= i+1; j < n; j++) {
                 if (x[minIndex] > x[j]) {
                     minIndex = j;
                 }

                 int temp = x[minIndex];
                 x[minIndex] = x[i];
                 x[i] = temp;
             } // end of inner for loop
         } // end of outer for loop
         return x;
     } // end of basicSelectionSort method
}
