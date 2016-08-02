import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateApple() {
		Apple apple = new Apple();
		assertNotNull(apple);
	}

}
