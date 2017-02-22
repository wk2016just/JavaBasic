package javaclass;

import java.util.Date;

public class Employee {

	private String name = "wk2016";
	private Date date = new Date();
	private int salary ;
	public Employee(){
		salary = 1;
		this.raiseSalary();
		raiseSalary(); //相当于this.raiseSalary,所有类定义的方法都是用对象调用的，即Employee e = new；e.raiseSalary;除非static可以直接用方法
		raiseSalary(this);//相当于this.raiseSalary(this)，符号语义
	}
	
	public void raiseSalary(){
		this.salary += 5;
	}
	
	public void raiseSalary(Employee e){
		e.raiseSalary();
		System.out.println("raiseSalary(this)");
	}
	
	public int getSalary(){
		return salary;
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		System.out.println(e.getSalary());
	}
}
