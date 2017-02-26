package clonemethod;

public class CloneTest {

	public CloneTest clone(){
		NoCloneable a = new NoCloneable();
		int b = 2;
		return new CloneTest();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneTest n = new CloneTest();
		CloneTest nn = (CloneTest) n.clone();
	}
}
