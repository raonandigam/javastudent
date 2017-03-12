package javastudent;

public class Playerdetails {
	static String gamename;
	static int id;
	static String name;
	static int rank;
	static String health;
	
	public static void main(String[] args){
	
	 Playerdetails player = new Playerdetails();
	 player.gamename = "football";
	 player.id = 15030;
	 player.name = "chaitanya";
	 player.rank = 100;
	 player.health = "good";
	 System.out.println("game name :" +gamename);
     System.out.println("id :" +id);
	 System.out.println("name :" +name);
	 System.out.println("rank:" +rank);
	 System.out.println("health:" +health);
	}
}
