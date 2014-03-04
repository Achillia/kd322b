/**
 * @author Julia
 */

public class Bike {
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;

	/**
	 * Creates a bike
	 * Instance Variables color and size
	 * Checks if their values are allowed
	 */
	public Bike(String color, int size){
		if(Constants.IsColorAvailable(color)){
		this.color = color;
		}
		else{
			System.out.println("Color not available");
		}
		if(size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE){
		this.size = size;
		}
		else{
			System.out.println("Incorrect size");
		}
		nbrOfBikes = nbrOfBikes+1; 
	}
	
	/**
	 * Creates a bike
	 * Instance Variables color, size and price
	 * Checks if their values are allowed
	 */
	public Bike(String color, int size, int price){
		if(Constants.IsColorAvailable(color)){
		this.color = color;
		}
		else{
			System.out.println("Color not available");
		}
		if(size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE){
		this.size = size;
		}
		else{
			System.out.println("Incorrect size");
		}
		if(price >= Constants.MIN_PRICE && size <= Constants.MAX_PRICE){
		this.price = price;
		}
		else{
			System.out.println("Incorrect price");
		}
		nbrOfBikes = nbrOfBikes+1;
	}
	
	/**
	 * Gets the color of the Bike
	 */
	public String getColor(){
		return color;
	}
	
	/**
	 * Gets the size of the Bike
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * Gets the price of the Bike
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * Sets the price of the Bike 
	 */
	public void setPrice(int price){
		this.price = price;
	}

	/**
	 * Sets the Number of Bikes
	 */
	public static int getNumberOfBikes(){
		return nbrOfBikes;		
	}
	
}
