package javabasic;

import java.util.Arrays;

public class IrregularArray {

	public static void main(String[] args){
		final int max = 10;
		
		int[][] a = new int[max+1][];
		
		for(int i=0;i<=max;i+=1){
			a[i] = new int[i+1];//Èý½ÇÐÎ¾ØÕó
		}
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j] = (int) (Math.random()*100);
		
		System.out.println(Arrays.deepToString(a));
	}
}
