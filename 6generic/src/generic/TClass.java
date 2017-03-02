package generic;


public class TClass<T> {

	public static <T>  T newinstance(Class<T> c){
		try{
			return  c.newInstance();
		}catch(Exception e){
			return null;
		}
		
	}
	
	
	public static void main(String[] args){
		String t = newinstance(String.class);//传入class对象
	}
}