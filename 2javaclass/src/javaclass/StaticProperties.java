package javaclass;

public class StaticProperties {
	
	private int a;
	
	public StaticProperties(){
		a=1;
	}
	
	public static void setA(StaticProperties s){
		s.a = 2;
		StaticProperties ss = new StaticProperties();
	}
	
	public int getA(){
		return a;
	}

	public static void main(String[] args){
		StaticProperties s =new StaticProperties();
		StaticProperties.setA(s);
		System.out.println(s.getA());
	}
}
