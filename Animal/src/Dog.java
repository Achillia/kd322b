
public class Dog extends Mammal{
	public int recommendedWalkingTime;

	
	public Dog (String name, int bCount, int walkTime){
		this.Name = name;
		this.boobCount = bCount;
		this.recommendedWalkingTime = walkTime;
	}
	
	@Override
	public String getInfo() {
		String info = "The dog " + this.Name + " has " + this.boobCount + " nipples and needs at least " + this.recommendedWalkingTime + " minutes walks";
		return info;
	}
}
