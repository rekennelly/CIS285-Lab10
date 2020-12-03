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
         for (int i = 0; i < x.length; ++i) {
             for (int j= i+1; j < x.length; ++j) {
                 if (x[i] > x[j]) {
                     temp = x[i];
                     x[i] = x[j];
                     temp = x[j];
                 }
             } // end of inner for loop
         } // end of outer for loop
         return x;
     } // end of basicSelectionSort method
}
