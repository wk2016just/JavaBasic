package javabasic;

import java.util.Arrays;

import javabasic.EnumTest.Size;

public class ArrayTest {
	public static void main(String\u005B\u005D args){
		int[] a;
		a = new int[100];
		int l = a.length;
		
		for(int e:a){
			System.out.println(e);
		}
		
		int[] s = {1,3,2};
		s = new int[]{2,3,4};
		
		int[] ss = s;
		ss[1] = 2;
		System.out.println(s[0]);
		
		int[] cs = Arrays.copyOf(ss, 2);
		for(int e:cs){
			System.out.println(e);
		}
		
		Arrays.sort(s);
		for(int e:s){
			System.out.println(e);
		}
	
		System.out.println(Arrays.toString(s));
		
		int[][] d = {{1,2},{3,4},{6,5}};
		for(int[] row:d)
			for(int x:row)
				System.out.println(x);
	}
}
