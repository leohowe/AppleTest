
public class ApplePeeler implements IApplePeeler {

	@Override
	public boolean peel(Apple apple) {
		return "green".equals(apple.getColour())
				|| "red".equals(apple.getColour());
		}

}
