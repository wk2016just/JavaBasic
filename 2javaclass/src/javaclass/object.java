package javaclass;

import java.util.Date;

public class object {
	public static void main(String[] args){
		new Date(); //构造新对象
		System.out.println(new Date());//相当于匿名对象，其实方法操作的是new后返回的引用，之后处理引用指向的值，所以这里有引用值即可
		String s = new Date().toString();//同样的构造新对象
		
		Date birthday = new Date();//对象存放在变量内，变量代表一种数据类型；值是新创建对象的引用
		Date bd;//没有引用对象，无法操作；必须初始化！操作实际是对引用指向的内容操作类似之前syso(new Date())
		
	}
}
