package inherit;

public class StaticAnalysis {

	public static void main(String[] args){
		Boss a = new Boss("wk","talk");
		a.sayHello();//��̬������������֮�����Ҹ���public����ķ���ǩ��
		
		Employee e = new Employee("wk");
		Employee.staticOverride('a');//�Ƚ������ã���̬����static����
		
		Boss b = new Boss("wk","talk");
		b.methodList('w');
	}
}
