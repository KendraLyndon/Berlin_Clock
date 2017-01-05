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
		assertEquals(ConvertTopHours(18), "RRRO");
		assertEquals(ConvertTopHours(10), "RROO");
		assertEquals(ConvertTopHours(6), "ROOO");
		assertEquals(ConvertTopHours(2), "OOOO");
	}
	
	@Test
	public void testBottomHours(){
		assertEquals(ConvertBottomHours(19), "RRRR");
		assertEquals(ConvertBottomHours(13), "RRRO");
		assertEquals(ConvertBottomHours(12), "RROO");
		assertEquals(ConvertBottomHours(21), "ROOO");
		assertEquals(ConvertBottomHours(0), "OOOO");
	}
	
	@Test
	public void testTopMinutes(){
		assertEquals(ConvertTopMinutes(35),"YYYYYYYOOOO");
		assertEquals(ConvertTopMinutes(32),"YYYYYYOOOOO");
		assertEquals(ConvertTopMinutes(24),"YYYYOOOOOOO");
		assertEquals(ConvertTopMinutes(20),"YYYYOOOOOOO");
		assertEquals(ConvertTopMinutes(19),"YYYOOOOOOOO");
		assertEquals(ConvertTopMinutes(15),"YYYOOOOOOOO");
		assertEquals(ConvertTopMinutes(12),"YYOOOOOOOOO");
		assertEquals(ConvertTopMinutes(4),"OOOOOOOOOOO");
	}

	@Test
	public void testBottomMinutes(){
		assertEquals(ConvertBottomMinutes(34),"YYYY");
		assertEquals(ConvertBottomMinutes(18),"YYYO");
		assertEquals(ConvertBottomMinutes(22),"YYOO");
		assertEquals(ConvertBottomMinutes(51),"YOOO");
		assertEquals(ConvertBottomMinutes(30),"OOOO");
		assertEquals(ConvertBottomMinutes(5),"OOOO");
	}
}
