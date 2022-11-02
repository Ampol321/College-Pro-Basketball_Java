package myexam2_11_02_2022;

public class UserClass {

	public static void main(String[] args){
		
		BasketballPlayer bp1;
		CollegeBasketballPlayer bp2;
		ProBasketballPlayer bp3;
		
		bp1 = new BasketballPlayer("John Paul", " ", "Team 1",89,235,9,6,6);
		bp2 = new CollegeBasketballPlayer("Dave Merc", " ", "Team 2",77,0,5,5,0,0," ");
		bp3 = new ProBasketballPlayer("John Radilh", " ", "Team 3", 0,0,5,0,5,0," ");
		
		System.out.println("BASKETBALL PLAYER");
		System.out.println("-----------------");
		System.out.println(bp1.toString());
		System.out.println("COLLEGE PLAYER");
		System.out.println("--------------");
		System.out.println(bp2.toString());
		System.out.println("PRO PLAYER");
		System.out.println("----------");
		System.out.println(bp3.toString());
	}
}
