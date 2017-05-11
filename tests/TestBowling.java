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
		Frame partija = new Frame(10, 0);
		
		int prvoBacanje = partija.getFirstThrow();
		
		assertEquals(10, prvoBacanje);
	}
	
	@Test
	public void testIsStrikeB() {
		Frame partija = new Frame(10, 0);
		
		boolean strike = partija.isStrike();
		
		assertEquals(true, strike);
	}
	
	@Test
	public void testIsSpareB() {
		Frame partija = new Frame(7, 3);
		
		boolean spare = partija.isSpare();
		
		assertEquals(true, spare);
	}
	
	@Test
	public void testAddFrame() {
		BowlingGame game = new BowlingGame();
		Frame partija = new Frame(7, 3);
		
		boolean spare = partija.isSpare();
		
		assertEquals(true, spare);
	}

}
