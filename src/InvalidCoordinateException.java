
/**
 * This exception class is to handle when incorrect coordinates are entered.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class InvalidCoordinateException extends RuntimeException {

	public InvalidCoordinateException(String message){
		super(message);
	}
}//end InvalidCoordinateException
