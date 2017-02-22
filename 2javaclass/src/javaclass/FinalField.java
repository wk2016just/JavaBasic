package javaclass;

import java.sql.Date;

public class FinalField {

	private final int i;
	private String name;
	
	public FinalField(){
		i = 1;//±ÿ–Î≥ı ºªØi
		name = "hello";
	}
	
	public static void mian(String[] args){
		final Date a = new Date(0, 0, 0);
		a.setTime(0);

	}
}
