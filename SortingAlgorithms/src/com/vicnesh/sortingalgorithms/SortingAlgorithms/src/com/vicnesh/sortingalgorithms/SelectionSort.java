package com.vicnesh.sortingalgorithms;



/*
 * Selection Sort
 * Repeatedly finds the smallest element in the unsorted sequence of elements and storing it at the beginning
 * 
 * 2 subarrays are maintained in this algorithm:
 * sub-array 1 - sorted subarray
 * sub-array 2 - unsorted subarray
 * 
 * 
 * 
 * 
 */
public class SelectionSort {

	
	/*
	 * Constructor
	 * @parameter
	 * @return
	 */
	public SelectionSort() {
		System.out.println("\nSelection Sort Begin...");
	}
	

	/*
	 * Selection Sort
	 * 
	 * 
	 * 
	 */
	public void selectionSort(int array[]) {
		int min;
		int temp;
		
		for (int i = 0; i < array.length; i++) {
			min = i;
			
			for (int j = i+1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;

				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
}
