package javaclass;

import java.util.Date;

public class Employee {

	private String name = "wk2016";
	private Date date = new Date();
	private int salary ;
	public Employee(){
		salary = 1;
		this.raiseSalary();
		raiseSalary(); //�൱��this.raiseSalary,�����ඨ��ķ��������ö�����õģ���Employee e = new��e.raiseSalary;����static����ֱ���÷���
		raiseSalary(this);//�൱��this.raiseSalary(this)����������
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
