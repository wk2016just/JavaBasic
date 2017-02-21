package javabasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class FileInOut {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(Paths.get("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt")); //����Path�õ���File����
		while(in.hasNext()){
			System.out.println(in.nextLine());
		}
		in.close();
		
	
		PrintWriter out = new PrintWriter("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt");
		out.println("end");
		out.close();
		/*
			print() ������ͬ�� write() ����
			println() �������� print() �Ļ����϶������һ�� newLine() ����(˽�з���)
			�� newLine() ��������� flush()
			���Թؼ����� flush()
		 */
		
		Scanner endin = new Scanner(Paths.get("D:\\xampp\\htdocs\\javabasic\\src\\javabasic\\test.txt")); 
		while(endin.hasNext()){
			System.out.println(endin.nextLine());
		}
	}
}
