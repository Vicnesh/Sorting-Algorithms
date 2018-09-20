package com.vicnesh.sortingalgorithms;

import java.util.Scanner;

public class SortingAlgorithm {
	
	
	public static void main(String args[]) {
		//sorted array
		displayMenu();
		
	}
	
	
	
	//display menu
	private static void displayMenu() {
		System.out.println("Sorting Algorithms");
		System.out.println("1)Binary Search");
		System.out.println("2)Merge Sort");
		
		System.out.println("Please enter an option number: ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		userOption(userInput);
		scanner.close();
	}
	
	
	
	//user menu option
	private static void userOption(int userInput) {
		if (userInput == 1) {
			
			int array[] = {0, 1, 2, 3, 4, 5};
			int key = 2;
			
			System.out.print("\nBinary Search using array: ");
			
			for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
			}
			System.out.println("\nSearching for key: " + key);
			
			BinarySearch binarySearch = new BinarySearch();
			binarySearch.BinarySearchAlgorithm(array, 0, array.length-1, key);
			
			
		}
		
		if (userInput == 2) {
			
			int array[] = {1, 5, 0, 3, 2, 4};
			int key = 2;
			
			System.out.print("\nMerge Sort using array: ");
			for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
			}
			
			System.out.println("\nSearching for key: " + key);
			
			MergeSort mergeSort = new MergeSort();
			mergeSort.divideArray(array);
			
			
			
		}
		
		
	}

	
	

}
