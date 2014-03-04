
public class Cat extends Mammal{
	public boolean isPurebreed;

	public Cat (String name, int bCount, boolean breed){
		this.Name = name;
		this.boobCount = bCount;
		this.isPurebreed = breed;
	}
	
	@Override
	public String getInfo() {
		String info = "The cat " + this.Name + " has " + this.boobCount + " nipples and is " ;
		if(this.isPurebreed == true){
		info = info + "a purebreed" ;
		}else{
		info = info + "not a purebreed" ;	
		}
		return info;
	}

}
