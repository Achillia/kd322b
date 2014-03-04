
public class Human {
	private Dog dog;
	private String name;
	public final static int MIN_LETTERS = 3;
	
	
	public Human (String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	public String getInfo(){
		if(dog != null){
			String info = name + " owns a dog called " + dog.getName();
			return info;
		}
		else{
			String info = name + " does not own a dog";
			return info;
		}

	}

}
