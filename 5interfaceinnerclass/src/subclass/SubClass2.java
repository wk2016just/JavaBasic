package subclass;

import superclass.SuperClass;

public class SubClass2 extends SuperClass{

	public void accessSuperClass(int i){
		SubClass2 s2 = new SubClass2();
		s2.ac = i;//���������ʼ̳ж����ĸ���protected��
		s2.m(i);
		
		SuperClass ss = new SubClass2();
		ss.ac = 2;//������������ָ������������޷�����protected�����ġ�
	}
	
	public static void main(String[] args){
		new SubClass2().accessSuperClass(2);
	}
}
