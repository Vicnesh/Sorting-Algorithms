package com.vicnesh.sortingalgorithms;

import java.util.Scanner;
import java.util.Random;

public class SortingAlgorithm {
	
	/*
	 * Main
	 */
	public static void main(String args[]) {
		displayMenu();
		
	}
	
	
	/*
	 * Generates an array of integers of random size and random values
	 * @parameter
	 * @return - generated array of int
	 */
	private static int[] generateRandomArray() {
		Random randomNumber = new Random();
		int[] testArray = new int[randomNumber.nextInt(100)];
		
		for (int i = 0; i != testArray.length; i++) {
			testArray[i] = randomNumber.nextInt(100);
		}
		System.out.println("Size of generated array: " + testArray.length);
		return testArray;
	}
	
	
	/*
	 * Menu to display to user, then prompting user for an input for
	 * Which algorithm to display
	 * @parameter
	 * @return - 
	 */
	private static void displayMenu() {
		System.out.println("Sorting Algorithms");
		System.out.println("1)Binary Search");
		System.out.println("2)Merge Sort");
		System.out.println("3)Bubble Sort");
		System.out.println("4)Quick Sort");
		System.out.println("5)Selection Sort");
		
		System.out.println("Please enter an option number: ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		userOption(userInput);
		scanner.close();
	}
	
	
	/*
	 * Print elements of array
	 * @parameter - array elements to be printed
	 * @return
	 */
	public static void printArrayElements(int inputArray[]) {
		System.out.print("Printing array elements: ");
		for (int i = 0; i != inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}
	
	
	/*
	 * Checks the user option and performs the task chosen by the user according to the user option
	 * @parameter - user input option
	 * @return
	 */
	private static void userOption(int userInput) {
		if (userInput == 1) {
			
			int array[] = generateRandomArray();
			int key = 2;
			
			System.out.print("\nBinary Search using array: ");
			printArrayElements(array);
			
			System.out.println("\nSearching for key: " + key);
			
			BinarySearch binarySearch = new BinarySearch();
			binarySearch.BinarySearchAlgorithm(array, 0, array.length-1, key);
			
			
		}
		
		if (userInput == 2) {
			
			int array[] = generateRandomArray();
			
			System.out.print("\nMerge Sort using array: ");
			printArrayElements(array);
						
			MergeSort mergeSort = new MergeSort();
			mergeSort.divideArray(array);
			printArrayElements(array);
			
			
			
		}
		
		if (userInput == 3) {
			
			int array[] = generateRandomArray();
			
			System.out.print("\nBubble Sort using array: ");
			printArrayElements(array);
			
			BubbleSort bubbleSort = new BubbleSort();
			bubbleSort.bubbleSort(array);
			printArrayElements(array);
			
			
		}
		
		if (userInput == 4) {
			
			int array[] = generateRandomArray();
			
			System.out.print("\nQuick Sort using array: ");
			printArrayElements(array);
			
			QuickSort quickSort = new QuickSort();
			int high = array.length-1;
			quickSort.quickSort(array, 0, high);
			printArrayElements(array);
			
			
		}
		
		
		if (userInput == 5) {
			
			int array[] = generateRandomArray();
			
			System.out.print("\nSelection Sort using array: ");
			printArrayElements(array);
			
			SelectionSort selectionSort = new SelectionSort();
			selectionSort.selectionSort(array);
			printArrayElements(array);
			
			
		}
		
		
	}

	
	

}
