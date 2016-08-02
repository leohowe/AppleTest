/**
 * Class to represent an apple
 * @author Leo
 *
 */
public class Apple {
	private String colour;
	private double weight;
	private int taste;  // Taste 1, 2, 3, 4
	private boolean wormInside;
	
	public Apple(String colour, double weight, int taste, boolean wormInside)
	{
		
	}
	
	/**
	 * Returns the colour of the apple
	 * @return
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Returns the weight of the apple
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Returns the taste setting of the apple
	 * @return
	 */
	public int getTaste() {
		return taste;
	}

	/**
	 * Returns the weight of the apple
	 * @return
	 */
	public boolean hasWormInside() {
		return wormInside;
	}
}