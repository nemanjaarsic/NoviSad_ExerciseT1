import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testDoesReturnScore() {
		Frame partija = new Frame(2,7);
		
		int rez = partija.score();
		
		assertEquals(9, rez);
	}
	
	@Test
	public void testIsStrike() {
		Frame partija = new Frame(10.0);
		
		int rez = partija.score();
		
		assertEquals(9, rez);
	}

}
