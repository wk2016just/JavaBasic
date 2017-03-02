package getmiddle;

public class GetMiddle {
	
	public static <T> T getMiddel(T...a){
		return a[a.length/2];
	}
	
	public static void main(String[] args){
		String middle = GetMiddle.getMiddel("xt","wk","xf");
		System.out.println(middle);
		
		 GetMiddle.getMiddel(11.1,12,13);
		 
		double middle1 = GetMiddle.getMiddel(11.1,12,13);//wrong
		Comparable middle2 = GetMiddle.getMiddel(11.1,12,13);//right,comparable or number
		System.out.println(middle1);
	}
}
