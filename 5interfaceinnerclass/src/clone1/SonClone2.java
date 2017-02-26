package clone1;

public class SonClone2 extends FatherClone{
//同包访问性所以extends FatherClone可有可无
	public static void main(String[] args){
		FatherClone a = new FatherClone();
		a.clone();
	}
}
