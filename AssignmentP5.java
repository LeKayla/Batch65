import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cogent.basics.info;

public class AssignmentP5 {
	public static void main(String[] args) {
		int[] a = new int[] { 1,2,3,4};
		int[] b = new int[] {0,0,0,0};
		copy(a,b);
		System.out.println(b[0]);
	}

	// 1WAP to Search an Element in an Array
	public static int search(int[] a, int b) {
		for (int i : a) {
			if (i == b)
				return i;
		}
		return -1;
	}

	public static int findMax(int[] a) {
		Arrays.sort(a);
		return a[a.length - 1];
	}

	public static void SortControl(int[] a) {
		Arrays.sort(a);
	}

	public static void SortDesc(int[] a) {
		Integer[] aa = new Integer[a.length];
		for (int i = 0; i < a.length; i++)
			aa[i] = a[i];
		Arrays.sort(aa, Collections.reverseOrder());
	}

	public static void remove(int[] a) {
		List<Integer> FinalList = new ArrayList<Integer>();
		for (int temp : a) {
			if (!FinalList.contains(temp))
				FinalList.add(temp);
		}
	}
	
	private void merge() {
        int[] firstArray = {56,78,90,32,67,12}; //initialized array
        int[] secondArray = {11,14,9,5,2,23,15};
        int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray
        int[] mergedArray = new int[length];    //resultant array
        int pos = 0;
        for (int element : firstArray) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : secondArray) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
	}
	
	public boolean check(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			if(a.length!=b.length || a[i]!=b[i]) return false;
		}
		return true;
	}
	
	public void removeall(int[] a) {
		a=new int[a.length];
	}
	
	public void find(int[] a, int[] b) {
		Set<Integer> set = new HashSet<>();
		for(int i:a) set.add(i);
		for(int i:b) {
			if(set.contains(i)) System.out.println(i);
		}
	}
	
	public static void copy(int[] a, int[] b) {
//		b=new int[a.length];
//		b = a.clone();
//
//		b=new int[a.length];
//		b=Arrays.copyOf(a,a.length);
		
		for(int i=0; i<a.length; i++ ) {
			b[i] = a[i];
		}
	}
	
	public static void rotate(int[] a) {
		int s = 0, e = a.length-1;
		while(s<e) {
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;e--;
		}
	}
	
	
}
