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
		Frame partija1 = new Frame(1, 4);
		Frame partija2= new Frame(4, 5);
		Frame partija3 = new Frame(6, 4);	//spare
		Frame partija4 = new Frame(5, 5);	//spare
		Frame partija5 = new Frame(10, 0);	//strike
		Frame partija6 = new Frame(0, 1);
		Frame partija7 = new Frame(7, 3);	//spare
		Frame partija8 = new Frame(6, 4);	//spare
		Frame partija9 = new Frame(10, 0);
		Frame partija10 = new Frame(2, 8);
		
		boolean spare = partija.isSpare();
		
		assertEquals(true, spare);
	}
	
}
