package ReflectVariableParameter;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectVariableParameter {
		  
	    public static void main(String[] args) throws Exception {
	        Class<?> clazz = Single.class;
	        Single single = (Single) clazz.newInstance();
	        List<String> list = new ArrayList<String>(){
	            private static final long serialVersionUID = 1L;
	            {
	                add("wk");
	                add("ni");
	                add("hao");
	            }
	        };
	          
	        //获取method两种方式， 在method中 数组的的空间大小是可以随便写的不一定使用0
	        /* 1 */
	        Method method = clazz.getDeclaredMethod("method", Array.newInstance(Object.class, 0).getClass());
	        /* 2 */
	        method = clazz.getDeclaredMethod("method", (new Object[0]).getClass());
        
	        //初始化参数
	        /* 1 */
	        Object objs = Array.newInstance(Object.class, 2);
	        Array.set(objs, 0, list);
	        Array.set(objs, 1, "11");
	        method.invoke(single, objs);
	          
	        /* 2 */
	        Object[] objects = {1, "wk", list};
	        method.invoke(single, new Object[]{ objects });//因为可变参数的实现机制就是通过数组包装，内部的objects或者objs可以为任意的数组
	    }
	}
	  
	class Single {
	    public void method(Object... objs) {
	        System.out.println(Arrays.deepToString(objs));
	    }
}
	  
