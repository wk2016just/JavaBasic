package fingtheproblem;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class FindVariableParam {
		 public void print(String string)
		 {
		   System.out.println("print(String string)");
		   System.out.println(string);
		 }

		 public int print(String ... strings)
		 {
		   System.out.println("print(String ... string)");

		   for(String string: strings)
		     System.out.println(string);
		   
		   return 0;
		 }

		 public static void main(String[] args) throws Exception
		 {
		   FindVariableParam test = new FindVariableParam();

		   Method method1 = test.getClass().getMethod("print", String.class);
		   method1.invoke(test, "a");

		   Method method2 = test.getClass().getMethod("print", Array.newInstance(String.class, 0).getClass());
		   System.out.println(method2.toString()+"\n"+method2.getParameterTypes()[0]);
		   //输出的确是public int fingtheproblem.FindVariableParam.print(java.lang.String[])
		   //class [Ljava.lang.String;
		   //但是要转换为String类型
		   //抛去多参数组后new String[]{"a", "b"}无法解析为String！
		   System.out.println(new String[]{"a"}.getClass());

		   method2.invoke(test,new String[][]{new String[]{"a", "b"}});
		   
		   
		 }
	/*
	 * 修改1:
	 * 应该是一位数组
	 * 修改2:
	 *  method2.invoke(test, new String[]{new String[]{"a", "b"}});
	 *  Type mismatch: cannot convert from String[] to String 
	 *  但是String[]可以转换为object，所以invoke参数和返回类型都是Object
	 *  可变参数的机制是即使标注String .. string
	 *  修改3：
	 *  method2.invoke(test,new String[]{new String[]{"a", "b"}});
	 *  String[]匹配invoke第二个参数，但是后边无法转换为这个String[]内部的String类型（因为String[]只能接受String字符串而非String数组）
	 *  所以这种情况只能采用：
	 *  method2.invoke(test, new Object[]{new String[]{"a", "b"}});
	 *  
	 *  
	 *  解析！！！
	 *  首先有 Array.set(objs, 1, "23");的Array类的静态反射方法，传入对象（1,2索引共同确立一个对象）

		其次Objects...args  =  new Object[]
		即new Object[]{ new Integer(1),”wk”}
		则args的值为Object[0]位1，[1]为wk
		
		而invoke调用签名为invoke(Object a,Object ... args)
		所以调用的   method.invoke(single, new Object[]{ objects });//中objects才是实际的args！！
	 */
}
