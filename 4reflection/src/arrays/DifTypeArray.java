package arrays;

public class DifTypeArray {

	public static void main(String[] args){
		Object[] a = new Object[]{new String[]{"a", "b"},new String[]{"c"}};
		System.out.println(a.getClass());
		String[] b = (String[]) a[0];
		System.out.println(b[0]);
		System.out.println(a[0].getClass());//像a这种一位数组存二维数据的一维类型，无法直接取出其中数据比如a[0][1]
		//因为a第一个是object而第二个是string，数组要求的必须是一致或者可以容纳的父类
		
		String[] c = new String[]{"a","b"};
		System.out.println(c[0]);
		
	/*	输出：
	 * class [Ljava.lang.Object;
		a
		[Ljava.lang.String;@15db9742
		a*/

	}
}
