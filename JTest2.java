import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class JTest2 {

	public letters obj;
	
	@Before
	
	public void init() {
		obj = new letters();
	}
	
	@Test
	public void tc1() {
		assertEquals(2, obj.countLetterA("Aabc"));

	}
	
	@Test
	public void tc2() {
		assertEquals(0, obj.countLetterA("bc"));

	}
	
	@Test
	public void tc3() {
		assertEquals(0, obj.countLetterA(""));

	}

}
