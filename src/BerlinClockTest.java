import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest extends BerlinClock{

	@Test
	public void testSeconds(){
		assertEquals(ConvertSeconds(45),"O");
		assertEquals(ConvertSeconds(2),"Y");
	}
	
	@Test
	public void testTopHours(){
		assertEquals(ConvertTopHours(24), "RRRR");
		assertEquals(ConvertTopHours(20), "RRRR");
		assertEquals(ConvertTopHours(16), "RRRO");
		assertEquals(ConvertTopHours(10), "RROO");
		assertEquals(ConvertTopHours(6), "ROOO");
		assertEquals(ConvertTopHours(2), "OOOO");
	}
	
	@Test
	public void testBottomHours(){
		assertEquals(ConvertBottomHours(4), "RRRR");
		assertEquals(ConvertBottomHours(3), "RRRO");
		assertEquals(ConvertBottomHours(2), "RROO");
		assertEquals(ConvertBottomHours(1), "ROOO");
		assertEquals(ConvertBottomHours(0), "OOOO");
	}
}
