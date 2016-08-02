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
	private boolean peeled;
	private boolean eaten;
	public enum AppleColour { green, red, blue }
	
	public Apple(AppleColour colour, double weight, int taste, boolean wormInside) throws Exception
	{
		this.setColour(colour);
		this.setWeight(weight);
		this.setTaste(taste);
		this.wormInside = wormInside;
	}
	
	/**
	 * Returns the colour of the apple
	 * @return
	 */
	public String getColour() {
		return colour;
	}
	
	/**
	 * Sets the colour
	 */
	public void setColour(AppleColour colour)
	{
		this.colour = colour.name();
	}

	/**
	 * Returns the weight of the apple
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of the apple
	 */
	public void setWeight(double weight) throws Exception {
		if(weight < 10 || weight > 100)
			throw new Exception();
		else
			this.weight = weight;
	}
	
	/**
	 * Returns the taste setting of the apple
	 * @return
	 */
	public int getTaste() {
		return taste;
	}
	
	/**
	 * Sets the taste level
	 */
	public void setTaste(int taste) throws Exception
	{
		if(taste <1 || taste >4)
			throw new Exception();
		else
			this.taste = taste;
	}

	/**
	 * Returns the weight of the apple
	 * @return
	 */
	public boolean hasWormInside() {
		return wormInside;
	}
	
	/**
	 * Returns the peeled status
	 * @return
	 */
	public boolean isPeeled() {
		return peeled;
	}
	
	/**
	 * Sets the peeded status
	 * @param peeled
	 */
	private  void setPeeled(boolean peeled) {
		if(!wormInside && this.taste > 3 && peeled)
			this.peeled = peeled;
		else
			this.peeled = false;
	}
	
	/**
	 * Peels the apple
	 */
	public void peel(ApplePeeler peeler)
	{
		this.setPeeled(peeler.peel(this));
	}
	

	/**
	 * Returns the eaten status
	 * @return
	 */
	public boolean isEaten() {
		return eaten;
	}
	
	/**
	 * Sets the eaten status
	 * @param peeled
	 */
	public void setEaten(boolean eaten) {
		if(isPeeled() && eaten)
			this.eaten = eaten;
		else this.eaten = false;
	}

}