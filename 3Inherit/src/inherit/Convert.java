package inherit;

public class Convert {

	public static void main(String[] args){
		//Employee e = new Employee("wk"); 执行8行代码则会出错，说明强转必须实际类型符合才行
		Employee e = new Boss("wk","talk");
		Boss b = (Boss) e ;
		System.out.println(e.getSalary());
		b.setSalary(10);
		System.out.println(e.getSalary());
	}
}
