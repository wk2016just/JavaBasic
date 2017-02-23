package inherit;

public class Boss extends Employee{
	
	private String talk;
	
	public Boss(String name,String talk){
		super(name);
		this.talk = talk;
	}
	
	public void setTalk(String talk){
		this.talk = talk;
	}

	
	public void methodList(int a){
		System.out.println("Boss methodList!");
	}
}
