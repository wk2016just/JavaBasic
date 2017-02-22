package javaclass;

public class ExplicitField {

	private String name = "wk2016";
	//这么引用会造成栈溢出
	//private ExplicitField e = new ExplicitField();
	
	public ExplicitField(){
		
	}
	
	public String getName(){
		return name;
	}
	
	public  static void main(String[] args){
		ExplicitField e =new ExplicitField();
		System.out.println(e.getName());
		
	}
}
