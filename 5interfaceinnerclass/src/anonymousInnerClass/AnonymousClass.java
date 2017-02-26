package anonymousInnerClass;

import superclass.SuperClass;

public class AnonymousClass extends SuperClass{
	private String name;
	
	public AnonymousClass(String name){
		this.name = name;
	}
	
	public void walk(){
		System.out.println("noage");
	}

	public static void main(String[] args){
		AnonymousClass obj = new AnonymousClass("wk")
	      {
			  private int age = 10;
			  public void walk()
			  {
				  System.out.println(age);
			  }
	      };
	     obj.walk();
	     //注意：如果AnonymousClass没有walk方法这里也无法调用，毕竟匿名内部类只能做参数不能使用
	     System.out.println(obj.getClass() == AnonymousClass.class);
	}

	
}
