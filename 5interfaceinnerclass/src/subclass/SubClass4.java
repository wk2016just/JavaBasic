package subclass;

import superclass.SuperClass;

public class SubClass4 extends SuperClass{

	public void accessSuperClass(int i){
		SubClass1 s1 = new SubClass1();
		s1.ac =1;//子类中用另外一个子类的对象也不能访问父类中的protected变量  
	}
}
