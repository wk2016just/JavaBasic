package javabasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class FileInOut {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(Paths.get("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt")); //利用Path得到了File对象
		while(in.hasNext()){
			System.out.println(in.nextLine());
		}
		in.close();
		
	
		PrintWriter out = new PrintWriter("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt");
		out.println("end");
		out.close();
		/*
			print() 方法等同于 write() 方法
			println() 方法是在 print() 的基础上多调用了一个 newLine() 方法(私有方法)
			而 newLine() 方法会调用 flush()
			所以关键在于 flush()
		 */
		
		Scanner endin = new Scanner(Paths.get("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt")); 
		while(endin.hasNext()){
			System.out.println(endin.nextLine());
		}
	}
}
