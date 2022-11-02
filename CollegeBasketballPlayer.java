package myexam2_11_02_2022;

public class CollegeBasketballPlayer extends BasketballPlayer{
	
	protected int eligibilityRemaining;
	protected String role;
	
	public CollegeBasketballPlayer(){
		super();	
		eligibilityRemaining = 4;
		role = "Bench";
	}
	
	public CollegeBasketballPlayer(String name, String position, String team){
		super(name, position, team);
	}
	
	public CollegeBasketballPlayer(String name, String position, String team,
			int height, int weight, int agility, int speed, int ballHandling,
			int eligibilityRemaining, String role){
		
		super(name, position, team, height, weight, agility, speed, ballHandling);
		
		this.eligibilityRemaining = eligibilityRemaining;
		this.role = role;
	}

	public String getPosition() {
		/*YOU STILL NEED TO RETURN A VALUE OUTSIDE THE NESTED IF ELSE STATEMENTS
		AN ERROR WILL OCCUR IF THERE IS NO DEFAULT RETURN VALUE */
		
		if ((height >= 82) && (weight > 220 && weight < 250) && (ballHandling > 5)) {
			position = "Center";
			return position;
		}
		
		else if ((height >= 80) && (weight > 210 && weight < 260) && (ballHandling > 5)) {
			position = "Center";
			return position;
		}
		
		else if ((height >= 80) && (ballHandling > 4)) {
			position = "Center";
			return position;
		}
		
		else if ((height >= 78) && (agility > 7)) {
			position = "Center";
			return position;
		}
		
		else if (height >= 78) {
			position = "Center";
			return position;
		}
		
		else if ((height >= 76) && (agility > 5)) {
			position = "Center";
			return position;
		}
		
		else if (height >= 80 && agility > 8 || speed > 7) {
			position = "Forward";
			return position;
		}
		
		else if (height >= 78 && agility > 6 && speed > 5) {
			position = "Forward";
			return position;
		}
		
		else if (height >= 77 && agility > 5) {
			position = "Forward";
			return position;
		}
		
		else if (height >= 76 && speed > 4) {
			position = "Forward";
			return position;
		}
		
		else if (height >= 75 && agility > 3 || speed > 3) {
			position = "Forward";
			return position;
		}
		
		else if (height >= 74) {
			position = "Forward";
			return position;
		}
		
		else if(height >= 78 && ballHandling > 7 && agility > 7 || speed > 7) {
			position = "Guard";
			return position;
		}
		
		else if(height >= 76 && ballHandling > 7 && agility > 6 || speed > 6) {
			position = "Guard";
			return position;
		}
		
		else if(height >= 74 && ballHandling > 5 && agility > 5 && speed > 6) {
			position = "Guard";
			return position;
		}
		
		else if(ballHandling > 6 && agility > 6 && speed > 5) {
			position = "Guard";
			return position;
		}
		
		else if(ballHandling > 4 && agility > 4) {
			position = "Guard";
			return position;
		}
		
		return position;
	}
	
	public int getEligibilityRemaining() {
		return eligibilityRemaining;
	}

	public String getRole() {
		//THE VALUE OF DRAFTABLE() IS NEEDED TO GET THE ROLE(STRING) OUTPUT
		
		if (draftable() == true) {
			role = "Starter";
			return role;
		}
		else if (draftable() == false) {
			role = "Bench";
			return role;
		}
		return role;
	}

	public String toString() {
		return String.format( "%sRole: %s\nEligibility Remaining: %d\n",
				super.toString(), getRole(), getEligibilityRemaining());
	}
	
	public boolean draftable() {
		/*THE VALUE BEING USED IN THIS METHOD IS IN THE PARENT CLASS
		WHICH IS THE BASKETBALLPLAYER(), THEN YOU CAN DO NOW THE CONDITIONS
		USING THE PLAYER VALUE FROM THE PARENTCLASS*/
		
		if (super.getValue() > 4) {
			return true;
		}
		else if (super.getValue() >= 8) {
			return false;
		}
		return false;
	}
}
