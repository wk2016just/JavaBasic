package inherit;

public class ArrayInherit {

	public static void main(String[] args){
		Boss boss = new Boss("wk2016","many");
		Employee[] staff = new Employee[3];
		staff[0] = boss; //相当于引用赋值
		
		boss.setTalk("little");
		//staff[0].setTalk("little");  编译器将staff[0]看做Employee对象
		//因为编译器是静态绑定，所以不能用staff[0]
		
		Boss[] b = new Boss[10];
		Employee[] a = b;
		a[0] = new Employee("a0");
		b[0].setTalk("error");//java.lang.ArrayStoreException
		
	}
}
