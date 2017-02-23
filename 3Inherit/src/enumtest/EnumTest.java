package enumtest;

public class EnumTest {

	public enum Size{
		SMALL("S"),MEDIUM("M"),LARGE("L");
		
		private String abbreviation;
		
		private Size(String abbreviation){this.abbreviation = abbreviation;}
		public String getAbbreviation(){return abbreviation;}
	}
	
	
	public static void main(String[] args){
		System.out.println(Size.SMALL.toString());
		
		Size s = Enum.valueOf(Size.class,"SMALL");
		System.out.println(s);
		System.out.println(s.getAbbreviation());
		Size[] values = Size.values();
		
	}
}
