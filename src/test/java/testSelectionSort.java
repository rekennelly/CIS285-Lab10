/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.cis285.lab10.SelectionSort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kennelra
 */
public class testSelectionSort {
@Test
    public void test() {
	testPositive();
	testNegative();
	testMixed();
	testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort tester = new SelectionSort();
        int[] selectionSortedArr = tester.basicSelectionSort(arr);

        assertArrayEquals(selectionSortedArr,Sortedarr);
    }

    public void testNegative(){
        int[] arr2 = new int[7];
        arr2[0] = -8;
        arr2[1] = -6;
        arr2[2] = -7;
        arr2[3] = -5;
        arr2[4] = -3;
        arr2[5] = -1;
        arr2[6] = -9;

        int[] sortedArr2 = new int[7];
        sortedArr2[0] = -9;
        sortedArr2[1] = -8;
        sortedArr2[2] = -7;
        sortedArr2[3] = -6;
        sortedArr2[4] = -5;
        sortedArr2[5] = -3;
        sortedArr2[6] = -1;

        SelectionSort tester2 = new SelectionSort();
        int[] selectionSortedArr2 = tester2.basicSelectionSort(arr2);

        assertArrayEquals(selectionSortedArr2,sortedArr2);
     }

    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 35;
        arr[2] = -42;
        arr[3] = -7;
        arr[4] = -8;

        int[] sortedArr = new int[5];
        sortedArr[0] = -42;
        sortedArr[1] = -8;
        sortedArr[2] = -7;
        sortedArr[3] = 34;
        sortedArr[4] = 35;

        SelectionSort tester = new SelectionSort();
        int[] selectionSortedArr = tester.basicSelectionSort(arr);

        assertArrayEquals(selectionSortedArr,sortedArr);

        int[] arr2 = new int[6];
        arr2[0] = -4;
        arr2[1] = 8;
        arr2[2] = 15;
        arr2[3] = -16;
        arr2[4] = 23;
        arr2[5] = -42;

        int[] sortedArr2 = new int[6];
        sortedArr2[0] = -42;
        sortedArr2[1] = -16;
        sortedArr2[2] = -4;
        sortedArr2[3] = 8;
        sortedArr2[4] = 15;
        sortedArr2[5] = 23;

        SelectionSort tester2 = new SelectionSort();
        int[] selectionSortedArr2 = tester2.basicSelectionSort(arr2);

        assertArrayEquals(selectionSortedArr2,sortedArr2);
    }

    public void testDuplicates(){
       int[] positiveArr = new int[6];
       positiveArr[0] = 3;
       positiveArr[1] = 2;
       positiveArr[2] = 8;
       positiveArr[3] = 2;
       positiveArr[4] = 3;
       positiveArr[5] = 4;

       int[] sortedPositiveArr = new int[6];
       sortedPositiveArr[0] = 2;
       sortedPositiveArr[1] = 2;
       sortedPositiveArr[2] = 3;
       sortedPositiveArr[3] = 3;
       sortedPositiveArr[4] = 4;
       sortedPositiveArr[5] = 8;

       SelectionSort positiveTester = new SelectionSort();
       int[] selectionSortedPositives = positiveTester.basicSelectionSort(positiveArr);

       assertArrayEquals(selectionSortedPositives,sortedPositiveArr);

       int[] negativeArr = new int[6];
       negativeArr[0] = -16;
       negativeArr[1] = -19;
       negativeArr[2] = -75;
       negativeArr[3] = -16;
       negativeArr[4] = -22;
       negativeArr[5] = -1;

       int[] sortedNegativeArr = new int[6];
       sortedNegativeArr[0] = -75;
       sortedNegativeArr[1] = -22;
       sortedNegativeArr[2] = -19;
       sortedNegativeArr[3] = -16;
       sortedNegativeArr[4] = -16;
       sortedNegativeArr[5] = -1;

       SelectionSort negativeTester = new SelectionSort();
       int[] selectionSortedNegatives = negativeTester.basicSelectionSort(negativeArr);

       assertArrayEquals(selectionSortedNegatives,sortedNegativeArr);
    }
}
