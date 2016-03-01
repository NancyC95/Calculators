import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class PlanetScale {
	public static void main(String[] args){
	
			final Map<String, Double> planets = new HashMap<>();
			planets.put("Venus", 0.78);
			planets.put("Mars", 0.39);
			planets.put("Jupiter", 2.65);
			planets.put("Saturn", 1.17);
			planets.put("Uranus", 1.05);
			planets.put("Neptune", 1.23);
						
		double Eweight, pweight;
		String planetinput;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your weight on Earth?");
		Eweight = keyboard.nextDouble();
		
		System.out.println("Planets available to choose from:");
		System.out.println("1. Venus   2. Mars   3. Jupiter");
		System.out.println("4. Saturn  5. Uranus 6. Neptune");
		
		System.out.println("Which planet would you like to select?");
		planetinput = keyboard.next();
		
		//ex: planet -> "Mars" -> 0.39
		pweight = Eweight * planets.get(planetinput);
		
		System.out.println("Your weight on " + planetinput + " is " + pweight);
	}
}