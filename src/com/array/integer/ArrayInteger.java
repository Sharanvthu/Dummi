package com.array.integer;

import java.util.Arrays;

public class ArrayInteger 
{
	public static int[] sort(int[] a,int i,int l)
	{
		for (int j = 0; j < a.length; j++) {
			for (int j2 = j+1; j2 < a.length; j2++) {
				if(a[j]<a[j2]) {
					int temp = a[j];
					a[j]=a[j2];
					a[j2]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{

		int[] a= {20,30,10};
		System.out.println("==========Iterate using for loop==========");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Size of the the array");
		System.out.println(a.length);
		System.out.println("Ascending sort Using Arrays.sort() ");
				Arrays.sort(a);
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
		System.out.println("========Descending Sort==================");
		ArrayInteger.sort(a, 0, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
