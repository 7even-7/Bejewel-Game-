
public class PlayerProfile {
	String userName;
	int highestScore;
	
	public PlayerProfile(String name) {
		this.userName = name;
		this.highestScore = 0;
		
	
	}
	
	public String getName() {
		return this.userName;
	}
	public int getScore() {
		return this.highestScore;
	}
	public void setScore(int score) {
		this.highestScore = (highestScore > score) ? highestScore: score;
	}
	public void setName(String name) {
		this.userName = name;
	}
	
}
