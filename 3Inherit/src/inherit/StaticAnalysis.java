package inherit;

public class StaticAnalysis {

	public static void main(String[] args){
		Boss a = new Boss("wk","talk");
		a.sayHello();//静态解析最优适配之后会查找父类public相符的方法签名
		
		Employee e = new Employee("wk");
		Employee.staticOverride('a');//先解析调用，后静态分派static重载
		
		Boss b = new Boss("wk","talk");
		b.methodList('w');
	}
}
