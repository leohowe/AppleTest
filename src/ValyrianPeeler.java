
public class ValyrianPeeler implements IApplePeeler {

	@Override
	public void peel(Apple apple) {
		if(Apple.AppleColour.green.name().equals(apple.getColour())
				|| Apple.AppleColour.red.name().equals(apple.getColour())
				|| Apple.AppleColour.blue.name().equals(apple.getColour()))
			apple.setPeeled(true);
	}

}
