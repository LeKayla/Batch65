import java.security.PublicKey;

public class AssignmentSet4 {
	public static void main(String[] args) {
		sort2D();
	}

	// print a 2D array
	void add2d(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // print new line after each row
		}
	}

	// add 2 matrix
	void add2matrix(int[][] matrix1, int[][] matrix2) {
		// Create a new matrix to store the sum
		int[][] sum = new int[matrix1.length][matrix1[0].length];

		// Loop through each element of the matrices and add them
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print the sum matrix
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

//	Sort the 2D Array Across Columns java
	static void sort2D() {
		// Define a 2D array
		int[][] arr = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		// Sort the array across columns
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int z = 0; z < arr.length - 1 - i; z++) {
					if (arr[z][j] > arr[z + 1][j]) {
						int temp = arr[z + 1][j];
						arr[z + 1][j] = arr[z][j];
						arr[z][j] = temp;
					}
				}
			}
		}

		// Print the sorted array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void checkMatrixSame() {
		// Define two matrices
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Check if the matrices are equal
		boolean equal = true;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				if (matrix1[i][j] != matrix2[i][j]) {
					equal = false;
					break;
				}
			}
			if (!equal) {
				break;
			}
		}

		// Print the result
		if (equal) {
			System.out.println("The two matrices are equal");
		} else {
			System.out.println("The two matrices are not equal");
		}
	}

	public void transpose() {
		// Define a matrix
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Find the transpose of the matrix
		int[][] transpose = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		// Print the transpose
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int determinant(int[][] matrix) {
		int n = matrix.length;
		int det = 0;

		if (n == 1) {
			det = matrix[0][0];
		} else if (n == 2) {
			det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
		} else {
			for (int i = 0; i < n; i++) {
				int[][] submatrix = new int[n - 1][n - 1];

				for (int j = 1; j < n; j++) {
					for (int k = 0; k < n; k++) {
						if (k < i) {
							submatrix[j - 1][k] = matrix[j][k];
						} else if (k > i) {
							submatrix[j - 1][k - 1] = matrix[j][k];
						}
					}
				}

				int sign = (i % 2 == 0) ? 1 : -1;
				det += sign * matrix[0][i] * determinant(submatrix);
			}
		}

		return det;
	}

	public static int findNormal(int[][] matrix) {
		int normal = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				normal += matrix[i][j] * matrix[i][j];
			}
		}

		normal = (int) Math.sqrt(normal);

		return normal;
	}

	public static int findTrace(int[][] matrix) {
		int trace = 0;

		for (int i = 0; i < matrix.length; i++) {
			trace += matrix[i][i];
		}

		return trace;
	}

	public void boundary(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void rotat(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] rotatedMatrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
			}
		}

	}

	public void sumOfDiagonals(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int sumOfDiagonals = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j || i + j == rows - 1) {
					sumOfDiagonals += matrix[i][j];
				}
			}
		}
	}

	public void transFirstLast(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			int temp = matrix[i][0];
			matrix[i][0] = matrix[i][cols - 1];
			matrix[i][cols - 1] = temp;
		}
	}

	public void transFirstLastCol(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int j = 0; j < cols; j++) {
			int temp = matrix[0][j];
			matrix[0][j] = matrix[rows - 1][j];
			matrix[rows - 1][j] = temp;
		}
	}

}
