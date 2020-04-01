
/**
 * Location class encapsulates a point on a simulation map. Defines and sets x/y coordinates as well as handling invalid coordinates.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class Location {

	public int xCoord;
	public int yCoord;
	
	/**
	 * empty-argument constructor initializes instance variables
	 * 
	 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}//end empty-argument constructor
	
	/**
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		setxCoord(x);
		setyCoord(y);
		
	}//end preferred constructor
	
	/**
	 * update method includes InvalidCoordinateException which handles if an incorrect number is entered for x or y. 
	 * update method also accepts x and y coordinates and updates xCoord and yCoord
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		
		try {
			if(xCoord < 0 || yCoord < 0)
				throw new InvalidCoordinateException("x coordinate and y coordinate have to be greater than 0.");
			else
				setxCoord(xCoord);
				setyCoord(yCoord);
		}
		catch(InvalidCoordinateException ice) {
			System.out.println(ice.getMessage());
		}
		
	}//end update
	
	
		
		
		
	
	
	//GETTERS AND SETTERS
	
	/**
	 * getCoordinates sets up and returns an array for the x and y coordinates.
	 * @return l
	 */
	public int [] getCoordinates() {
		int l [] = new int [] {xCoord, yCoord};
		return l;
	}//end getCoordinates

	
	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
	
}//end Location
