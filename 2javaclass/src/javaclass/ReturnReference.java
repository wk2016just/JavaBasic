package javaclass;

import java.util.Date;

public class ReturnReference {

	private Date day;
	private String name;
	
	public Date getDay(){
		return day;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args){
		
		ReturnReference e = new ReturnReference();
		Date d = e.getDay();
		double seconds = 10*265.25*24*60*60*1000;
		d.setTime(d.getTime()-(long)seconds);//d还没有初始化，不能使用set。
											//所以报错java.lang.NullPointerException
		ReturnReference ee = new  ReturnReference();
		String t = ee.getName();
		t.trim(); //对字符串也一样会报错，因为字符串初始化零值是null而不是基本类型的0
	}
}
