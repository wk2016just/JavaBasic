package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;

public class ObjectGetClass {
	
	private String name;
	
	public ObjectGetClass(String name){
		this.name = name;
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		ObjectGetClass o = new ObjectGetClass("wk");
		Class c = o.getClass();
		System.out.println(o.getClass().getName());
		
		String s = new String("reflect.ObjectGetClass");
		Class c1 = Class.forName(s);
		
		Class c2 = Date.class;
		Class c3 = int.class;
		
		System.out.println(c3);
		
		System.out.println(o.getClass() == ObjectGetClass.class);
		
		c.newInstance();
		//c.newInstance("wk");java.lang.InstantiationException
		Constructor test = ObjectGetClass.class.getConstructor(String.class);
		Object a = test.newInstance("wk");
		ObjectGetClass b = (ObjectGetClass)a;
	}
}
