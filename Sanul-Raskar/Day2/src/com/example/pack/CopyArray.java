package com.example.pack;

/*
 * Lab Exercise 19
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class CopyArray {

	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// Initialize array
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Create another array arr2 with size of arr1
		int arr2[] = new int[arr1.length];

		System.out.println("Elements of original array: ");
		printArray(arr1);

		System.out.println();
		// Copying all elements of one array into another
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Displaying elements of array arr2
		System.out.println("Elements of new array: ");
		printArray(arr2);

	}
}
