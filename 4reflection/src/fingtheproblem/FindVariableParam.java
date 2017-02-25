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
		   //�����ȷ��public int fingtheproblem.FindVariableParam.print(java.lang.String[])
		   //class [Ljava.lang.String;
		   //����Ҫת��ΪString����
		   //��ȥ��������new String[]{"a", "b"}�޷�����ΪString��
		   System.out.println(new String[]{"a"}.getClass());

		   method2.invoke(test,new String[][]{new String[]{"a", "b"}});
		   
		   
		 }
	/*
	 * �޸�1:
	 * Ӧ����һλ����
	 * �޸�2:
	 *  method2.invoke(test, new String[]{new String[]{"a", "b"}});
	 *  Type mismatch: cannot convert from String[] to String 
	 *  ����String[]����ת��Ϊobject������invoke�����ͷ������Ͷ���Object
	 *  �ɱ�����Ļ����Ǽ�ʹ��עString .. string
	 *  �޸�3��
	 *  method2.invoke(test,new String[]{new String[]{"a", "b"}});
	 *  String[]ƥ��invoke�ڶ������������Ǻ���޷�ת��Ϊ���String[]�ڲ���String���ͣ���ΪString[]ֻ�ܽ���String�ַ�������String���飩
	 *  �����������ֻ�ܲ��ã�
	 *  method2.invoke(test, new Object[]{new String[]{"a", "b"}});
	 *  
	 *  
	 *  ����������
	 *  ������ Array.set(objs, 1, "23");��Array��ľ�̬���䷽�����������1,2������ͬȷ��һ������

		���Objects...args  =  new Object[]
		��new Object[]{ new Integer(1),��wk��}
		��args��ֵΪObject[0]λ1��[1]Ϊwk
		
		��invoke����ǩ��Ϊinvoke(Object a,Object ... args)
		���Ե��õ�   method.invoke(single, new Object[]{ objects });//��objects����ʵ�ʵ�args����
	 */
}
