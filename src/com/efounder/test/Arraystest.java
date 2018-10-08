package com.efounder.test;

import java.util.Arrays;

public class Arraystest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a1 = new int[10];
		int []a2 = new int[10];
		Arrays.fill(a1, 10);
		Arrays.fill(a2, 10);
		System.out.println(Arrays.equals(a1, a2));
		Arrays.fill(a2, 0, 4, 5);
		boolean bool = Arrays.equals(a1, a2);
		System.out.println(bool);
		a2[5]=3;
		a2[6]=2;
		Arrays.sort(a2);
		System.out.println(Arrays.binarySearch(a2, 3));
		for(int i=0;i<a2.length;i++)
		{
			System.out.println("the value is:"+a2[i]);
		}
	}

}
