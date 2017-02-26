package doublebracketinitial;

import java.util.ArrayList;

public class DoubleBracketInitial {
	static void sayhi(ArrayList<String> friends){
		System.out.println(friends.toString());
	}

	public static void main(String[] args){
		ArrayList<String> friends = new ArrayList<>();
		friends.add("xiatian");
		friends.add("xianfeng");
		sayhi(friends);
		
		sayhi(new ArrayList<String>(){{add("nihao");add("haohao");}});
		
		
	}
}
