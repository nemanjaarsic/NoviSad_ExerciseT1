import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testDoesReturnScore() {
		Frame partija = new Frame(2,7);
		
		int rez = partija.score();
		//String rez = Integer.toString(partija.score());
		
		assertEquals(9, rez);
	}

}
