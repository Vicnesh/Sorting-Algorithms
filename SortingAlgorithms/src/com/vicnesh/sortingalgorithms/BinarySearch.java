package com.vicnesh.sortingalgorithms;

/* Binary Search
 * Recursive algorithm used to locate a target value
 * within a sorted sequence of n elements.
 */


public class BinarySearch {
	
	//variables
	
	
	//methods
	//constructor
	public BinarySearch() {
		System.out.println("Binary Search Begin...");
	}
	
	
	//Binary search algorithm
	//@parameter: array sequence, low, high, key
	//@return: boolean, true if key is found, false if key does not exist
	public boolean BinarySearchAlgorithm(int sequence[], int low, int high, int key) {
		
		if (low > high) {
			System.out.println("Key does not exist in number sequence!");
			return false;
		}
		else {
			int mid = (low+high)/2;		
			
			if (key == sequence[mid]) {
				System.out.println("Key found in index: " + mid);
				return true;
			}
			
			else if (key < sequence[mid]) {
				this.BinarySearchAlgorithm(sequence, low, mid -1, key);
			}
			
			else if (key > sequence[mid]) {
				this.BinarySearchAlgorithm(sequence, mid+1, high, key);
			}
		}
		System.out.println("Key does not exist in number sequence!");
		return false;
	}
	
	





}
