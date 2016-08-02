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
		apple = new Apple(Apple.AppleColour.red, 10, 1, true);
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
		Apple apple1 = new Apple(Apple.AppleColour.green, 10, 0, true);
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
		Apple apple2 = new Apple(Apple.AppleColour.green, 10, 1, true);
		assertNotNull(apple2);
		assertTrue(apple2.getWeight() >= 10 && apple2.getWeight() <= 100);
	}
	
	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.green, 0, 1, true);
	}
	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange2() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.green, 101, 0, true);
	}

	/**
	 * Test apple not instantiated with incorrect weight 
	 */
	@Test (expected = Exception.class)
	public void testAppleWeight_isOutsideRange3() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.green, 9, 0, true);
	}

	/**
	 * Test apple colour invalid
	 */
	@Test (expected = Exception.class)
	public void testAppleColour_isINvalid() throws Exception {
		Apple apple3 = new Apple(null, 10, 2, true);
	}
	
	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isGreen() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.green, 10, 2, true);
		assertEquals("green", apple3.getColour().toLowerCase());
	}

	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isRed() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.red, 10, 2, true);
		assertEquals("red", apple3.getColour().toLowerCase());
	}

	/**
	 * Test apple colour 
	 */
	@Test
	public void testAppleColour_isBlue() throws Exception {
		Apple apple3 = new Apple(Apple.AppleColour.blue, 10, 2, true);
		assertEquals("blue", apple3.getColour().toLowerCase());
	}
	
	/**
	 * Test apple not peelable
	 */
	@Test
	public void testApplePeeler_CantPeelGreen() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple unPeelableApple = new Apple(Apple.AppleColour.green, 10, 2, false);
		
		unPeelableApple.peel();
		assertFalse(unPeelableApple.isPeeled());
	}
	

	/**
	 * Test apple not peelable
	 */
	@Test
	public void testApplePeeler_CantPeelBlue() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple unPeelableApple = new Apple(Apple.AppleColour.blue, 10, 4, false);
		
		unPeelableApple.peel();
		assertFalse(unPeelableApple.isPeeled());
	}
				
	/**
	 * Test apple not peelable
	 */
	@Test
	public void testApplePeeler_CantPeelRed() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple unPeelableApple = new Apple(Apple.AppleColour.red, 10, 3, false);
		
		unPeelableApple.peel();
		assertFalse(unPeelableApple.isPeeled());
	}
	
	/**
	 * Test Green apple is peelable
	 */
	@Test
	public void testApplePeeler_PeelGreen() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple peelableApple = new Apple(Apple.AppleColour.green, 10, 4, false);
		
		peelableApple.peel();
		assertTrue(peelableApple.isPeeled());
	}

	/**
	 * Test Red apple is peelable
	 */
	@Test
	public void testApplePeeler_PeelRed() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple peelableApple = new Apple(Apple.AppleColour.red, 10, 4, false);
		
		peelableApple.peel();
		assertTrue(peelableApple.isPeeled());
	}
	
	/**
	 * Test Blue apple is not peelable with normal peeler
	 */
	@Test
	public void testApplePeeler_PeelBlueWithNormalPeeler() throws Exception {
		ApplePeeler peeler = new ApplePeeler();
		Apple peelableApple = new Apple(Apple.AppleColour.blue, 10, 4, false);
		
		peelableApple.peel();
		assertFalse(peelableApple.isPeeled());
	}
	
	/**
	 * Test Blue apple is peelable with Valyrian peeler
	 */
	@Test
	public void testApplePeeler_PeelBlueWithValyrianPeeler() throws Exception {
		ValyrianPeeler peeler = new ValyrianPeeler();
		Apple peelableApple = new Apple(Apple.AppleColour.blue, 10, 4, false);
		
		peelableApple.peel();
		assertTrue(peelableApple.isPeeled());
	}
}