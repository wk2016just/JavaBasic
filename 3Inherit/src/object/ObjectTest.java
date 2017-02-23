package object;

public class ObjectTest {
	
	private String name;
	private int salary;
	
	public int hashCode(){
		return 7*name.hashCode()
				+new Integer(salary).hashCode();
	}
	
	public static void main(String[] args){
		Object o = new Object();
		System.out.println(o instanceof ObjectTest);
		
		ObjectTest[] t = new ObjectTest[10];
		System.out.println(t);
	}
}
