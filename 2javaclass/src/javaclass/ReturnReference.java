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
		d.setTime(d.getTime()-(long)seconds);//d��û�г�ʼ��������ʹ��set��
											//���Ա���java.lang.NullPointerException
		ReturnReference ee = new  ReturnReference();
		String t = ee.getName();
		t.trim(); //���ַ���Ҳһ���ᱨ����Ϊ�ַ�����ʼ����ֵ��null�����ǻ������͵�0
	}
}
