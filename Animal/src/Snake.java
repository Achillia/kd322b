
public class Snake extends Animal{
	public boolean isPoisonous;

	public Snake (String name, boolean isPoisonous){
		this.Name = name;
		this.isPoisonous = isPoisonous;
	}
	@Override
	public String getInfo() {
		String info = "The snake " + this.Name + " is " ;
		if(this.isPoisonous == true){
			info = info + "poisonous" ;
			}else{
			info = info + "not a poisonous" ;	
			}
		return info;
	}

}
