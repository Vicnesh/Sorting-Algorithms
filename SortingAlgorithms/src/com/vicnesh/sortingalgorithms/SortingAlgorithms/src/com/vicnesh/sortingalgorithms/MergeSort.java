package com.vicnesh.sortingalgorithms;


/* Merge Sort Algorithm
 * Uses a divide and conquer approach:
 * 
 * 1) Divide: 
 * If the input size is smaller than a specified number (n = 1) then solve
 * in a straightforward method. Else divide the input data set into two or more subsets
 * 
 * 2) Conquer: 
 * Solve subsets recursively
 * 
 * 3) Combine: 
 * Merge solutions into original problem
 * 
 */


public class MergeSort {
	
	
	//methods
	//constructor
	public MergeSort() {
		System.out.println("\nMerge Sort Begin...");
	}

	
	
	//divide into roughly 2 equal arrays
	public void divideArray(int inputArray[]) {
		
		int arraySize = inputArray.length;
		
		if (arraySize > 1) {
			//divide
			int mid = arraySize/2;
			int array1[] = new int[mid];
			int array2[] = new int[arraySize-mid];
			
			//first array
			for (int i = 0; i < mid; i++) {
				array1[i] = inputArray[i];	
			}
			
			//second array
			int j = 0;
			for (int i = mid; i < arraySize; i++) {	
				array2[j] = inputArray[i];
				//System.out.print(array2[j] + " ");
				j++;
			}
			
			this.divideArray(array1);
			this.divideArray(array2);
			this.mergeArrays(array1, array2, inputArray);
		}
	}
	
	
	//merge arrays
	private void mergeArrays(int array1[], int array2[], int inputArray[]) {
		
		int i = 0;
		int j = 0;
		
		while (i + j < inputArray.length) {
			if ((j == array2.length) || (i < array1.length && array1[i] < array2[j])) {
				inputArray[i+j] = array1[i];
				i++;
			}
			else {
				inputArray[i+j] = array2[j];
				j++ ;
			}
		}
	}
	
	
	
	
	
	
	
	
}
