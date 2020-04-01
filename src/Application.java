import java.util.*;
/**
 * Application class tests all getters/setters/methods/constructors/exceptions for every class in the package.
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 3
 * Spring/2020
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******************************");
		System.out.println("          Location");
		
		Location l = new Location();
		//testing exception for x coordinate so it would display the message, also works for y coordinate.
		l.setxCoord(-1);
		l.setyCoord(5);
		System.out.println("(" +l.getxCoord()+","+l.getyCoord()+")");
		l.update(2, 3);
		//worked hard on update method, could not get it to show my new xCoord and yCoord.
		System.out.println("Updated coordinates = "+Arrays.toString(l.getCoordinates()));
		System.out.println(l.toString());
		System.out.println("******************************");
		
		
		
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("           Animal");
		
		//Animal a = new Animal(); 
		System.out.println("Cannot instantiate the type Animal because it is abstract.");
		System.out.println("******************************");
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("          Goldfinch");
		Goldfinch g = new Goldfinch();
		//set an invalid wingspan so it would display exception message.
		g.setWingSpan(4.0);
		System.out.println(g.getWingSpan()+"\n");
		g.fly(l);
		g.walk(1);
		System.out.println(g.toString());
		
		
		Animal g1 = new Goldfinch();
		//eat and sleep methods will change from true and false if you keep running program due to the random number generator
		System.out.println("full = "+g1.eat());
		System.out.println("rested = "+g1.sleep()+"\n");
		//testing simID for its exception message
		g1.setSimID(-1);
		//set/get Location prints out an array showing the x and y coordinates.
		g1.setLocation(l);
		System.out.println(g1.getSimID()+"\n");
		System.out.println(g1.getLocation());
		
		System.out.println(g1.toString());
		
		System.out.println("******************************");
		
		//did not include getters/setters for rested and full because sleep and eat methods get same results
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("         Brown Bear");
		BrownBear b = new BrownBear();
		b.walk(-1);
		b.swim(2);
		//set an invalid subspecies so it would display my exception message.
		b.setSubSpecies("Black");
		System.out.println(b.getSubSpecies()+"\n");
		System.out.println(b.toString());
		
		
		Animal br = new BrownBear();
		//eat and sleep methods will change from true and false if you keep running program due to the random number generator
		System.out.println("full = "+br.eat());
		System.out.println("rested = "+br.sleep()+"\n");
		//same as goldfinch, testing simID for its exception message.
		br.setSimID(-1);
		System.out.println(br.getSimID()+"\n");
		br.setLocation(l);
		System.out.println(br.getLocation());
		System.out.println(br.toString());
		System.out.println("******************************");
				
		//did not include getters/setters for rested and full because sleep and eat methods get same results

	}//end main

}//end Application
