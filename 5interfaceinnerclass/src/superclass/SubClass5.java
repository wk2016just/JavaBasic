package superclass;

public class SubClass5 extends SuperClass{

	public void accessSuperClass(int i){
		SuperClass ss = new SuperClass();
		ss.ac = 1;//子类中用父类对象反而不能访问父类中的protected变量  
	}
}
