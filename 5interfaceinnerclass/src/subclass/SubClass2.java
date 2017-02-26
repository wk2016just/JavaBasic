package subclass;

import superclass.SuperClass;

public class SubClass2 extends SuperClass{

	public void accessSuperClass(int i){
		SubClass2 s2 = new SubClass2();
		s2.ac = i;//子类对象访问继承而来的父类protected量
		s2.m(i);
		
		SuperClass ss = new SubClass2();
		ss.ac = 2;//出错，父类引用指向子类对象是无法调用protected变量的。
	}
	
	public static void main(String[] args){
		new SubClass2().accessSuperClass(2);
	}
}
