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
	     //ע�⣺���AnonymousClassû��walk��������Ҳ�޷����ã��Ͼ������ڲ���ֻ������������ʹ��
	     System.out.println(obj.getClass() == AnonymousClass.class);
	}

	
}
