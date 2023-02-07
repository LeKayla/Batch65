package com.cogent.basics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
	public static void main(String[] args) {
		int a = 0, e = a, h = e;
		boolean t = true;
		a++;
		a+=1;
		byte b = 0;
		short c = 0;
		double d = 1.11;
		d = d + 1;
		String s= "I'm Le";
		List<Integer> list = new ArrayList<>();
		list.add(a);
		boolean g = a==2? true:false;
		if(t && g) s = "Le is me";
		if((e|h)==0) System.out.println(a|e);
		int f = 2;
		System.out.println(f>>1);
	}
}
