package subclass;

import superclass.SuperClass;

public class SubClass1 extends SuperClass{

	public void accessSuperClass(int i){
		ac = i; //子类可以直接访问父类protected量
	}
}
