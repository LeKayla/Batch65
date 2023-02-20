package com.cogent.abstractConcept;

public class Assignment {
	public static void main(String[] args) {
		
	}
	static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
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
	
	public static boolean isPalindrome(String str){
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
	     for(int i = 0;i<a.length;i++){
	         for(int j = 0;j<a[0].length;j++){
	            c[i][j] = a[i][j]+b[i][j];
	            System.out.print(c[i][j]+" ");
	         }
	         System.out.println();
       }
	}
}
