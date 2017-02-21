package javabasic;

import javabasic.EnumTest.Size;

public class StringTest {
	public static void main(String[] args){
		String s = "hello";
		System.out.println(s.substring(0, 3) + 1);
		System.out.println(s == "hello");
		System.out.println(s.substring(0, 3) == "hel");
		System.out.println(s.compareTo("aello"));
		
		String w = s.intern();
		System.out.println(w.substring(0,3).equals("hel"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("o",1));
		System.out.println(s.lastIndexOf("l"));
		
		System.out.println(s.replace("l", "me"));
		System.out.println(s);
		
		System.out.println("  java abc ".trim());
		
		StringBuilder builder = new StringBuilder();
		builder.append("hell");
		builder.append('o');
		builder.setCharAt(0, 'y');
		builder.insert(5, "andpink");//index是要插入的位置，所以不是4
		System.out.println(builder.toString());
	}
}
