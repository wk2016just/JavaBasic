package employeesort;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NoComparableInterface {

		private String name;
		private double salary;
		
		public NoComparableInterface(String name,double salary){
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

		public int compareTo(NoComparableInterface other) {
			return Double.compare(salary, other.salary);
		}
		
		public static void main(String[] args){
			NoComparableInterface[] staff = new NoComparableInterface[3];
			
			staff[0] = new NoComparableInterface("wk2",200);
			staff[1] = new NoComparableInterface("wk1",100);
			staff[2] = new NoComparableInterface("wk3",300);
			
			Comparator<NoComparableInterface> comp = Collections.reverseOrder();
			Arrays.sort(staff,comp);
			//employeesort.NoComparableInterface cannot be cast to java.lang.Comparable
			Class a = Arrays.class;
			Method[] ms = a.getMethods();
			for(Method m:ms){
				System.out.println(m.toString());
			}
			//public static void java.util.Arrays.sort(java.lang.Object[],java.util.Comparator)
			//根据指定比较器产生的顺序对指定对象数组进行排序。 null值指示该元素的自然顺序应该被使用
			
			for(NoComparableInterface e:staff){
				System.out.println(e.getName() + ":" + e.getSalary());
			}
		}


}
