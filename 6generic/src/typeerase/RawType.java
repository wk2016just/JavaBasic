package typeerase;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class RawType {
	
		public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
			ArrayList<Integer> arrayList3=new ArrayList<Integer>();
			arrayList3.add(1);//��������add����ֻ�ܴ洢���Σ���Ϊ�������͵�ʵ��ΪInteger
			//arrayList3.add("12");//wrong
			arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "asd");
			//method����Ϊobject����Integer
			for (int i=0;i<arrayList3.size();i++) {
				System.out.println(arrayList3.get(i));
			}
		}
}
