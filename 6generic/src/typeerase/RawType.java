package typeerase;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class RawType {
	
		public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
			ArrayList<Integer> arrayList3=new ArrayList<Integer>();
			arrayList3.add(1);//这样调用add方法只能存储整形，因为泛型类型的实例为Integer
			//arrayList3.add("12");//wrong
			arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "asd");
			//method参数为object而非Integer
			for (int i=0;i<arrayList3.size();i++) {
				System.out.println(arrayList3.get(i));
			}
		}
}
