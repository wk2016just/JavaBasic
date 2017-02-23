package inherit;

public class Employee {
	
	private String name;
	
	private int salary = 100;
	
	public static void staticOverride(int i){
		System.out.println("Employee int!");
	}
	
	public static void staticOverride(char a){
		System.out.println("Employee char!");
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int s){
		salary = s;
	}
	
	public void sayHello(){
		System.out.println("Employee hello!");
	}
	
	public void methodList(char a){
		System.out.println("Employee methodList!");
	}
}
