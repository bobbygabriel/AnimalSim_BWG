
/**
 * This exception class handles when an incorrect sub-species is listed.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class InvalidSubspeciesException extends RuntimeException{

	public InvalidSubspeciesException(String message) {
		super(message);
	}
}//end InvalidSubspeciesException
