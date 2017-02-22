package javaclass;

public class ThisAnotherInit {

	private int i = 100;
	
	public ThisAnotherInit(){
		this(10);
	}
	
	public ThisAnotherInit(int i){
		this.i = i;
	}
}
