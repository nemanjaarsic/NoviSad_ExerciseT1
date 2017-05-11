public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int score;
	private boolean strike = false;
	private boolean spare = false;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		this.score = firstThrow + secondThrow;
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
			strike = true;
		return strike;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}
}
