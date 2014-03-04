/**
 * @author Julia
 */
public class Constants {
	public final static int MIN_SIZE = 8;
	public final static int MAX_SIZE = 28;
	public final static int MIN_PRICE = 0;
	public final static int MAX_PRICE = 30000;
	public final static String[] AVAILABLE_COLORS = {"red", "blue", "yellow", "green", "orange", "white", "black", "gold", "silver", "pink", "purple"};
	
	/**
	 * Compare input color to available colors in the StringArray
	 */
	public static boolean IsColorAvailable(String color){
		for(int i = 0; i < AVAILABLE_COLORS.length; i++){
			String currentColor = AVAILABLE_COLORS[i];
			if(currentColor.equalsIgnoreCase(color)){
				return true;
			}
		}
		return false;
	}
}
