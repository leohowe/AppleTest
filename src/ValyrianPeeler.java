
public class ValyrianPeeler extends ApplePeeler {

	@Override
	public boolean peel(Apple apple) {
		return "green".equals(apple.getColour())
				|| "red".equals(apple.getColour())
				|| "blue".equals(apple.getColour());
		}

}