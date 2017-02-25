package reflect;

import java.lang.reflect.Field;

public class ObjectReflect {
	
	private String name;
	private int age;
	
	public ObjectReflect(String name,int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		ObjectReflect o = new ObjectReflect("wk",10);
		Class c = o.getClass();
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);//AccessibleObject是Field Method Constructor三类的超类
		Object v = f.get(o);
		
		Field f2 = c.getDeclaredField("age");
		f2.setAccessible(true);//AccessibleObject是Field Method Constructor三类的超类
		int i = f2.getInt(o);
	}
}
