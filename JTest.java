import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class JTest {

	public Square obj;
	
	@Before
	
	public void init() {
		obj = new Square();
	}
	
	@Test
	public void tc1() {
		assertEquals(25, obj.square(5));

	}

}
