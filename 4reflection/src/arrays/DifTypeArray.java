package arrays;

public class DifTypeArray {

	public static void main(String[] args){
		Object[] a = new Object[]{new String[]{"a", "b"},new String[]{"c"}};
		System.out.println(a.getClass());
		String[] b = (String[]) a[0];
		System.out.println(b[0]);
		System.out.println(a[0].getClass());//��a����һλ������ά���ݵ�һά���ͣ��޷�ֱ��ȡ���������ݱ���a[0][1]
		//��Ϊa��һ����object���ڶ�����string������Ҫ��ı�����һ�»��߿������ɵĸ���
		
		String[] c = new String[]{"a","b"};
		System.out.println(c[0]);
		
	/*	�����
	 * class [Ljava.lang.Object;
		a
		[Ljava.lang.String;@15db9742
		a*/

	}
}
