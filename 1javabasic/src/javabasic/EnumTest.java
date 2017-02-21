package javabasic;

public class EnumTest {
	enum Size {SMALL,MEDIUM,LARGE};
	
	public static void main(String\u005B\u005D args){
		//enum Size {SMALL,MEDIUM,LARGE};
		//enum只能定义在类中，方法体不行
		Size s = Size.SMALL;
		System.out.println(s);
	}
}