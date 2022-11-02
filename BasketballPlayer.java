package myexam2_11_02_2022;

public class BasketballPlayer {
	
	protected String name, position, team;
	protected int height, weight, agility, speed, ballHandling, value;
	
	public BasketballPlayer() {
		name = "unknown";
		position = "unknown";
		team = "unknown";
		height = 0;
		weight = 0;
		agility = 0;
		speed = 0;
		ballHandling = 0;
	}
	
	public BasketballPlayer(String name, String position, String team) {
		this.name = name;
		this.position = position;
		this.team = team;
	}
	
	public BasketballPlayer(String name, String position, String team,
			int height, int weight, int agility, int speed, int ballHandling) {
		this.name = name;
		this.position = position;
		this.team = team;
		this.height = height;
		this.weight = weight;
		this.agility = agility;
		this.speed = speed;
		this.ballHandling = ballHandling;
	}
	
	public String getName() {
		return name;
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
	
	public String getTeam() {
		return team;
	}

	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getBallHandling() {
		return ballHandling;
	}
	
	public String toString() {
		return String.format("Name: %s\nPosition: %s\nTeam: %s\n"+
				"Height: %d\nWeight: %d\nAgility: %d\nSpeed: %d\nBall Handling: %d\nValue: %d\n",
				getName(),getPosition(),getTeam(),getHeight(),getWeight(),
				getAgility(),getSpeed(),getBallHandling(),getValue());
	}
	
	public int getValue() {
		//YOU STILL NEED TO RETURN A VALUE OUTSIDE THE NESTED IF ELSE STATEMENTS
		if ((height >= 82) && (weight > 220 && weight < 250) && (ballHandling > 5)) {
			value = 10;
			return value;
		}
		
		else if ((height >= 80) && (weight > 210 && weight < 260) && (ballHandling > 5)) {
			value = 8;
			return value;
		}
		
		else if ((height >= 80) && (ballHandling > 4)) {
			value = 6;
			return value;
		}
		
		else if ((height >= 78) && (agility > 7)) {
			value = 5;
			return value;
		}
		
		else if (height >= 78) {
			value = 4;
			return value;
		}
		
		else if ((height >= 76) && (agility > 5)) {
			value = 2;
			return value;
		}
		
		else if (height >= 80 && agility > 8 || speed > 7) {
			value = 10;
			return value;
		}
		
		else if (height >= 78 && agility > 6 && speed > 5) {
			value = 8;
			return value;
		}
		
		else if (height >= 77 && agility > 5) {
			value = 6;
			return value;
		}
		
		else if (height >= 76 && speed > 4) {
			value = 5;
			return value;
		}
		
		else if (height >= 75 && agility > 3 || speed > 3) {
			value = 3;
			return value;
		}
		
		else if (height >= 74) {
			value = 1;
			return value;
		}
		
		else if(height >= 78 && ballHandling > 7 && agility > 7 || speed > 7) {
			value = 10;
			return value;
		}
		
		else if(height >= 76 && ballHandling > 7 && agility > 6 || speed > 6) {
			value = 8;
			return value;
		}
		
		else if(height >= 74 && ballHandling > 5 && agility > 5 && speed > 6) {
			value = 6;
			return value;
		}
		
		else if(ballHandling > 6 && agility > 6 && speed > 5) {
			value = 4;
			return value;
		}
		
		else if(ballHandling > 4 && agility > 4) {
			value = 2;
			return value;
		}
		return value;
	}
	
}
