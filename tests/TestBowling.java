import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testDoesReturnScore() {
		Frame partija = new Frame(2,7);
		
		int rez = partija.score();
		
		assert(9, rez);
	}

}
