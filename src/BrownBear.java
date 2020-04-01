
/**
 * BrownBear Class is a subclass of animal. Also, it implements the interfaces Walkable and Swimmable. Handles when in invalid sub-species is entered.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies;
	
	/**
	 * empty-argument constructor initializes instance variables
	 * 
	 */
	public BrownBear() {
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}//end empty-argument constructor
	
	/**
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		setSimID(simID);
		setLocation(l);
		this.full = false;
		this.rested = true;
		this.subSpecies = "Alaskan";
		
		
	}//end preferred constructor

	/**
	 * walk method tells where the Brown bear walks in the x and y coordinate plane.
	 *
	 */
	public void walk(int direction) {
		
		switch(direction) {
		
		//up
		case 1:
			this.location.yCoord = this.location.yCoord+3;
			break;
			
		//down
		case -1:
			this.location.yCoord = this.location.yCoord-3;
			break;
			
		//right
		case 2:
			this.location.xCoord = this.location.xCoord+3;
			break;
			
		//left	
		case -2:
			this.location.xCoord = this.location.xCoord-3;
			break;
		
		default:
			
		}//end switch
	}//end walk
	
	
	/**
	 * swim method tells where the Brown bear to swim on the x and y coordinate plane.
	 *
	 */
	public void swim(int direction) {
		
		switch(direction) {
		
		//up
		case 1:
			this.location.yCoord = this.location.yCoord+2;
			break;
			
		//down
		case -1:
			this.location.yCoord = this.location.yCoord-2;
			break;
			
		//right
		case 2:
			this.location.xCoord = this.location.xCoord+2;
			break;
			
		//left	
		case -2:
			this.location.xCoord = this.location.xCoord-2;
			break;
		
		default:
			
		}//end switch
	}//end swim
	
	
	//GETTERS AND SETTERS
	
	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	/**
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
		
		try {
			if(subSpecies == "Alaskan")
				setSubSpecies(subSpecies);
			else if(subSpecies == "Asiatic")
				setSubSpecies(subSpecies);
			else if(subSpecies == "European")
				setSubSpecies(subSpecies);
			else if(subSpecies == "Grizzly")
				setSubSpecies(subSpecies);
			else if(subSpecies == "Kodiak")
				setSubSpecies(subSpecies);
			else if(subSpecies == "Siberian")
				setSubSpecies(subSpecies);
			else
				throw new InvalidSubspeciesException("Invalid subspecies");
				
		}
		catch(InvalidSubspeciesException ise) {
			System.out.println(ise.getMessage());
		}
	}//end setSubSpecies
		

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + "]";
	}//end toString
	
	
}//end BrownBear
