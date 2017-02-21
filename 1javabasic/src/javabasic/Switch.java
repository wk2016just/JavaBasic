package javabasic;

import java.util.Scanner;

public class Switch {
	enum Size {SMALL,MEDIUM,LARGE};
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		switch(a.toLowerCase()){
			case"nihao":
				System.out.println("wohao");
				break;
			case"wohao":
			case"tahao":
				System.out.println("wohao");
				break;
			default:
				System.out.println("enen");
		}
		
		Size sz = Size.SMALL;
		switch(sz){
		case SMALL:
			System.out.println("SMALL");
			break;
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
		default:
			System.out.println("LARGE");
		}
		loop:for(int i=0;i<10;i++){
			for(int j=0;j<5;j++)
				break loop;
		}
		System.out.println("next\n");
		
	}
}
