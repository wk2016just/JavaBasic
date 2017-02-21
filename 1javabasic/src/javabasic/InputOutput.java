package javabasic;

import java.util.Date;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String phrase = in.nextLine();
		String word = in.next();
		int a = in.nextInt();
		double b = in.nextDouble();
		StringBuilder ss = new StringBuilder();
		while(in.hasNext()){
			ss.append(in.nextLine());
			System.out.println(ss);
		}

		System.out.println(phrase + ":" + word + ":" + a + ":" + b);
		
		System.out.printf("%3d\n",2);
		System.out.printf("%,(.2f\n",-2.2342);
		System.out.printf("%,(.2f\n",2.2342);
		
		String s = String.format("hello,%s year", "2016");
		
		System.out.printf("%tc",new Date());
		
		System.out.printf("%1$s,%2$ty,%1$s\n","imone",new Date());
		System.out.printf("%ty,%<ty\n",new Date());
	}
}
