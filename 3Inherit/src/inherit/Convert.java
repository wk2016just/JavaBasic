package inherit;

public class Convert {

	public static void main(String[] args){
		//Employee e = new Employee("wk"); ִ��8�д���������˵��ǿת����ʵ�����ͷ��ϲ���
		Employee e = new Boss("wk","talk");
		Boss b = (Boss) e ;
		System.out.println(e.getSalary());
		b.setSalary(10);
		System.out.println(e.getSalary());
	}
}
