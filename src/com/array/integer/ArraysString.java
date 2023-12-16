package com.array.integer;

public class ArraysString {

	public static void main(String[] args) {

		int sum=0;
		int[] a = new int[3];
		String[] s= {"10","20","30"};
		
		System.out.println("===============================");
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.parseInt(s[i]);
			sum+=a[i];
		}
		System.out.println("============================");
		System.out.println(sum);
		ArrayInteger ai=new ArrayInteger();
		ai.sort(a, 0, a.length);
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}

}
