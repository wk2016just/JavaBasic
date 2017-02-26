package superclass;

public class SuperClass {
	protected int ac = 0;
	
	protected void m(int i){
		ac = i;
		System.out.println(getClass().getName());
		System.out.println(ac);
	};
}
