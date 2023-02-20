package com.cogent.abstractConcept;

import java.util.Random;

public class Assignment {
	public static void main(String[] args) {

	}

	static void subString(char str[], int n) {
		// Pick starting point
		for (int len = 1; len <= n; len++) {
			// Pick ending point
			for (int i = 0; i <= n - len; i++) {
				// Print characters from current
				// starting point to current ending
				// point.
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {
					System.out.print(str[k]);
				}

				System.out.println();
			}
		}
	}

	private static void palindrome(String a) {
		StringBuilder input = new StringBuilder(a);
		System.out.println(input.reverse());
	}

	public static boolean isPalindrome(String str) {
		// Initializing an empty string to store the reverse
		// of the original str
		String rev = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}

	public void addTwoMatrix(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multiMatrix() {
		// creating two matrices
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		// creating another matrix to store the multiplication of two matrices
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
	}

	public static void replace() {
		String str = new String("Good Harry Good");
		System.out.println("Initial String : " + str);
		// replacing "Good" with "Bad"
		str = str.replaceAll("Good", "Bad");
		System.out.println("The String after substitution : " + str);
	}

	public static void random() {
		// Instance of random class
		Random rand = new Random();
		// Setting the upper bound to generate the
		// random numbers in specific range
		int upperbound = 25;
		// Generating random values from 0 - 24
		// using nextInt()
		int int_random = rand.nextInt(upperbound);
		// Generating random using nextDouble
		// in 0.0 and 1.0 range
		double double_random = rand.nextDouble();
		// Generating random using nextDouble
		// in 0.0 and 1.0 range
		float float_random = rand.nextFloat();

		// Printing the generated random numbers
		System.out.println("Random integer value from 0 to" + (upperbound - 1) + " : " + int_random);
		System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
		System.out.println("Random double value between 0.0 and 1.0 : " + double_random);
	}

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

}
