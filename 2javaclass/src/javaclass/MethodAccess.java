package javaclass;

public class MethodAccess {

	private int i ;
	
	public void setI(){
		i = 1;
	}
	
	public boolean equals(MethodAccess b){
		return this.i == b.i;
	}
	
	public static void main(String[] args){
		MethodAccess m = new MethodAccess();
		MethodAccess mm = new MethodAccess();
		m.setI();
		mm.setI();
		System.out.println(m.equals(mm));
	}
}
