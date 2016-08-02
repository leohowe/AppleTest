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
		apple = new Apple("", 10, 1, true);
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
	 * Test apple taste fail
	 */
	@Test (expected = Exception.class)
	public void testAppleHasNoTaste() throws Exception{
		Apple apple1 = new Apple("", 10, 0, true);
	}
	
	/**
	 * Test apple taste success
	 */
	@Test
	public void testAppleHasTaste() {
		assertNotEquals(0, apple.getTaste());
		assertTrue(apple.getTaste() >= 1 && apple.getTaste() <= 4);
		
	}
	
	/**
	 * Test apple worm flag
	 */
	@Test
	public void testAppleHasWorm() {
		assertTrue(apple.hasWormInside());
		
	}
	
	/**
	 * Test apple instantiated with correct weight 
	 */
	@Test
	public void testAppleWeight_isInRange() throws Exception {
		Apple apple2 = new Apple("", 10, 1, true);
		assertNotNull(apple2);
		assertTrue(apple2.getWeight() >= 10 && apple2.getWeight() <= 100);
	}
	
	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange() throws Exception {
		Apple apple3 = new Apple("", 0, 1, true);
	}
	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange2() throws Exception {
		Apple apple3 = new Apple("", 101, 0, true);
	}

	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange3() throws Exception {
		Apple apple3 = new Apple("", 9, 0, true);
	}

	/**
	 * Test apple colour invalid
	 */
	@Test (expected = Exception.class)
	public void testAppleColour_isINvalid() throws Exception {
		Apple apple3 = new Apple("Yellow", 10, 2, true);
	}
	
	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isGreen() throws Exception {
		Apple apple3 = new Apple("", 10, 2, true);
		assertEquals("green", apple3.getColour().toLowerCase());
	}

	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isRed() throws Exception {
		Apple apple3 = new Apple("", 10, 2, true);
		assertEquals("red", apple3.getColour().toLowerCase());
	}

	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isBlue() throws Exception {
		Apple apple3 = new Apple("", 10, 2, true);
		assertEquals("blue", apple3.getColour().toLowerCase());
	}
}