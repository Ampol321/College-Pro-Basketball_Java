package myexam2_11_02_2022;

public class ProBasketballPlayer extends BasketballPlayer{
	
	protected String role;
	protected int yearsInLeague;
	
	public ProBasketballPlayer(){
		super();	
		yearsInLeague = 0;
		role = "Bench";
	}
	
	public ProBasketballPlayer(String name, String position, String team){
		super(name, position, team);
	}
	
	public ProBasketballPlayer(String name, String position, String team,
			int height, int weight, int agility, int speed, int ballHandling,
			int yearsInLeague, String role){
		
		super(name, position, team, height, weight, agility, speed, ballHandling);
		
		this.yearsInLeague = yearsInLeague;
		this.role = role;
	}
	
	public String getRole() {
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

	public int getYearsInLeague() {
		return yearsInLeague;
	}

	public String toString() {
		return String.format("%sYears in League: %s\nRole: %s\nContract Value: %d",
				super.toString(), getYearsInLeague(), getRole(), newContractValue());
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
	
	public int newContractValue() {
		/*YOU STILL NEED TO RETURN A VALUE OUTSIDE THE NESTED IF ELSE STATEMENTS
		AN ERROR WILL OCCUR IF THERE IS NO DEFAULT RETURN VALUE */
		
		/*DETERMINE FIRST THE PLAYER ROLE STARTING TO DRAFTABLE() TO GETROLE()
		ONCE THE ROLE HAS BEEN DETERMINED, YOU CAN NOW RETURN A SPECIFIC CONTRACT VALUE
		IN A SPECIFIC ROLE AND BASED ON ITS YEARS IN THE LEAGUE.*/
		
		if (getRole().equals("Starter")) {
			if (getYearsInLeague() < 3) {
				return 0;
			}
			
			else if (getValue() > 8 && getYearsInLeague() >= 10) {
				return 12000000;
			}
			
			else if (getValue() > 7 && getYearsInLeague() >= 8) {
				return 10000000;
			}
			
			else if (getValue() > 7 && getYearsInLeague() >= 5) {
				return 8000000;
			}
			
			else if (getValue() > 5 && getYearsInLeague() >= 10) {
				return 6000000;
			}
			return 1000000;
		}
		
		if (getRole().equals("Bench")) {
			if (getValue() > 8 && getYearsInLeague() >= 10) {
				return 7500000;
			}
			
			else if (getValue() > 7 && getYearsInLeague() >= 8) {
				return 5000000;
			}
			
			else if (getValue() > 5 && getYearsInLeague() >= 10) {
				return 4500000;
			}
			
			else if (getYearsInLeague() >= 7) {
				return 2000000;
			}
			return 500000;
		}
		return 0;
	}
}
