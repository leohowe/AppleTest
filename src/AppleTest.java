import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Class to test the representation of an apple
 * @author Leo
 *
 */
public class AppleTest {

	private Apple apple;
	
	@Before
	public void setUp() throws Exception {
		apple = new Apple("", 10, 0, true);
	}
	
	/**
	 * Test apple can be instantiated
	 */
	@Test
	public void testCreateApple() {
		assertNotNull(apple);
	}
	
	/**
	 * Test apple colour
	 */
	@Test
	public void testAppleHasColour() {
		assertNotNull(apple.getColour());
		
	}

	/**
	 * Test apple weight
	 */
	@Test
	public void testAppleHasWeight() {
		assertNotEquals(0, apple.getWeight(), 0);
		
	}

	/**
	 * Test apple taste
	 */
	@Test
	public void testAppleHasTaste() {
		assertNotEquals(0, apple.getTaste());
		
	}
	
	/**
	 * Test apple worm flag
	 */
	@Test
	public void testAppleHasWorm() {
		assertTrue(apple.hasWormInside());
		
	}
	
}