package javaclass;

public class ExplicitField {

	private String name = "wk2016";
	//��ô���û����ջ���
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
