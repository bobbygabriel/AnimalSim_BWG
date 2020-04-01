
/**
 * Goldfinch Class is a subclass of Animal. It also implements the Flyable and Walkable interfaces. Handles when an invalid wing span is entered.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class Goldfinch extends Animal implements Flyable, Walkable {

	private double wingSpan;
	
	/**
	 * empty-argument constructor initializes instance variables
	 * 
	 */
	public Goldfinch() {
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
		wingSpan = 9.0;
		
	}//end empty-argument constructor
	
	/**
	 * @param simID
	 * @param l
	 * @param wingSpan
	 */
	public Goldfinch(int simID, Location l, double wingSpan) {
		setSimID(simID);
		setLocation(l);
		setWingSpan(wingSpan);
		this.full = false;
		this.rested = true;
		
			
	}//end preferred constructor

	
	/**
	 * fly method tells where goldfinch to move based on the location indicated for the parameter in flyable interface.
	 *
	 */
	public void fly(Location l) {
		location = new Location(this.location.xCoord, this.location.yCoord);
	}//end fly
	
	
	/**
	 * walk method tells where goldfinch to walk on the x and y coordinate plane.
	 *
	 */
	public void walk(int direction) {
		
		switch(direction) {
		
		//up
		case 1:
			this.location.yCoord = this.location.yCoord+1;
			break;
			
		//down
		case -1:
			this.location.yCoord = this.location.yCoord-1;
			break;
			
		//right
		case 2:
			this.location.xCoord = this.location.xCoord+1;
			break;
			
		//left	
		case -2:
			this.location.xCoord = this.location.xCoord-1;
			break;
		
		default:
			
		}//end switch
	}//end walk
	
	
	//GETTERS AND SETTERS
	
	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;

		try {
			if(wingSpan <= 5.0 || wingSpan >= 11.0)
				throw new InvalidWingSpanException("Wing span needs to be between 5cm and 11cm.");
			else
				setWingSpan(wingSpan);
			
		}
		catch (InvalidWingSpanException iwse) {
			System.out.println(iwse.getMessage());
		}
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + "]";
	}//end toString
	
}//end Goldfinch
