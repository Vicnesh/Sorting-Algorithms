package com.vicnesh.sortingalgorithms;



/* Quick Sort Algorithm
 * 
 * Quicksort is a divide and conquer algorithm.
 * 
 * Divide
 * 1. Pick an element called a pivot, from the array.
 *    Choose the last element in the sequence to be pivot
 *	  Remove all elements from the sequence and divide into 3 sequences 
 *    Array 1: elements less than pivot
 *    Array 2: elements equal to pivot
 *    Array 3: elements more than pivot
 *   
 * Conquer
 * 2. Recursively sort Array 1 and Array 3
 * 
 * Combine
 * 3. Combine the elements into the main sequence in order by first inserting elements of Array 1
 *    then Array 2 then Array 3
 * 
 * 
 */


public class QuickSort {
	
	
	/*
	 * Constructor
	 * @parameter 
	 * @return
	 */
	public QuickSort() {
		System.out.println("\nQuick Sort Begin...");
	}
	
	
	
	
	public void quickSort(int array[], int low, int high) {
		
		if (low < high) {
			int partioningIndex = divide(array, low, high);
			
			
			quickSort(array, low, partioningIndex-1);
			quickSort(array, partioningIndex+1, high);
		}
	}
	
	
	/*
	 * Partition array
	 * Choose last element in array as pivot
	 * @parameter 
	 * @return
	 */
	public int divide(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low-1);
		
		for (int j = low; j<high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		
		return i+1;
			
		}
		
		
}
