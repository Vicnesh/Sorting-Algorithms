package com.vicnesh.sortingalgorithms;



/*
 * Bubble Sort
 * Loops through the array and compares adjacent pair of elements,
 * Swaps them if they are not in order
 * 
 */

public class BubbleSort {

	
	/*
	 * Constructor
	 * @parameter
	 * @return
	 */
	public BubbleSort() {
		System.out.println("\nBubble Sort Begin...");
	}
	
	
	/*
	 * Sorts an array using bubble sort algorithm
	 * @parameter - array to be sorted
	 * @return
	 */
	public void bubbleSort(int inputArray[]) {
		if (inputArray.length < 2) {
			System.out.println("List has less than 2 elements");
		}
		else {
			int temp = 0;
			for (int i =  0; i != inputArray.length; i++) {
				for (int k = 1; k != inputArray.length-i; k++ ) {
					if (inputArray[k-1] > inputArray[k]) {
						temp = inputArray[k-1];
						inputArray[k-1] = inputArray[k];
						inputArray[k] = temp;
					}
				}
			}
		}
	}
	
	
	/*
	 * Print elements of array
	 * @parameter - array elements to be printed
	 * @return
	 */
	public void printArrayElements(int inputArray[]) {
		System.out.print("Print sorted array elements: ");
		for (int i = 0; i != inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
