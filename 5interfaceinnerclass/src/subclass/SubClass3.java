package subclass;

import superclass.SuperClass;

public class SubClass3 extends SuperClass{

	public void accessSuperClass(int i){
		SuperClass ss = new SuperClass();
		ss.ac = 1;//�������ø�����󷴶����ܷ��ʸ����е�protected����  
	}
}
