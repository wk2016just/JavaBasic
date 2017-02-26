package clone2;

import clone1.FatherClone;

public class SonClone extends FatherClone{
	
	public void m(){
		super.clone();
	}

	public static void main(String[] args){
		Object a = new Double(2);
		Object b = a.clone();
	}
}
