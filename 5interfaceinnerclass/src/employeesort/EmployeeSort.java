package employeesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSort implements Comparable<EmployeeSort> {

	private String name;
	private double salary;
	
	public EmployeeSort(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeSort other) {
		return Double.compare(salary, other.salary);
	}
	
	public static void main(String[] args){
		EmployeeSort[] staff = new EmployeeSort[3];
		
		staff[0] = new EmployeeSort("wk2",200);
		staff[1] = new EmployeeSort("wk1",100);
		staff[2] = new EmployeeSort("wk3",300);
		
		Arrays.sort(staff);
		
		for(EmployeeSort e:staff){
			System.out.println(e.getName() + ":" + e.getSalary());
		}
	}
	
}
