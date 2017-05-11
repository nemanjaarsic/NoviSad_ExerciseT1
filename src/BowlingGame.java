import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusPoints = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//if(bonus.isStrike() == true)
			//bonusPoints = firstThrow + secondThrow + frames.get(i);
	}
	
	// Returns the game score
	public int score(){
		int rez = 0;
		for(int i = 1; i <= 10; i++)
			rez = rez + frames.get(i).score();
		return rez;
	}
}
