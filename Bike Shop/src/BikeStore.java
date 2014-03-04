import java.util.ArrayList;


public class BikeStore {
	private ArrayList<Bike> bikes;
	
	public BikeStore(){
		bikes = new ArrayList<Bike>();
	}
	
	public String getAllBikes(){
		String result = "";
		for(int i = 0; i < bikes.size(); i++){
			
			Bike currentBike = bikes.get(i);
			result += i + ", " +  currentBike.getColor() +", "+ currentBike.getSize() +", "+currentBike.getPrice() +"\n" ;
		}
		return result;
	}
	
	public String addBike(String color, String size, String price){
		Bike Bike1 = new Bike(color, Integer.parseInt(size), Integer.parseInt(price) );
		bikes.add(Bike1);
		
		return "Bike added"; 
	}
	
	
}
