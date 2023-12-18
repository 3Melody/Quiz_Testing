import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class JTest3 {
	
	 boolean T = true;
	 boolean F = false;

	public twoletters obj;
	
	@Before
	
	public void init() {
		obj = new twoletters();
	}
	
	@Test
	public void tc1() {
		assertEquals(F,obj.checkTwoLetter("A") );
	}
	
	@Test
	public void tc2() {
		assertEquals(T,obj.checkTwoLetter("AA") );
	}


}