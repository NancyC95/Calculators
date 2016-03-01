import java.util.Scanner;
/*Another way of writing the program PlanetScale (A program that uses the relative gravity of multiple planets to convert 
your weight on Earth to your weight on a planet of your choice) without the use of Hashmaps*/
public class PlanetScale2 {
	public static void main(String[] args){
		double Eweight, venus, mars, jupiter, saturn, uranus, neptune, pweight = 0;
		//How to initialize a whole line at a time:
		Eweight = venus = mars = jupiter = saturn = uranus = neptune = 0;
		int planetg;
		String planet = "";
	
		//Relative gravities of each planet:
		venus = 0.78;
		mars = 0.39;
		jupiter = 2.65;
		saturn = 1.17;
		uranus = 1.05;
		neptune = 1.23;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your weight on Earth in pounds?");
		Eweight = keyboard.nextDouble();
		
		System.out.println("Planets available to choose from:");
		System.out.println("1. Venus   2. Mars   3. Jupiter");
		System.out.println("4. Saturn  5. Uranus 6. Neptune");
		
		System.out.println("Which planet would you like to select? Please enter its number!");
		planetg = keyboard.nextInt();
		
		if (planetg == 1){
			planet = "Venus";
			pweight = Eweight * venus;
		}
		else if (planetg == 2){
			planet = "Mars";
			pweight = Eweight * mars;
		}
		else if (planetg == 3){
			planet = "Jupiter";
			pweight = Eweight*jupiter;
		}
		else if (planetg == 4){
			planet = "Saturn";
			pweight = Eweight*saturn;
		}
		else if (planetg == 5){
			planet = "Uranus";
			pweight = Eweight*uranus;
		}
		else if (planetg == 6){
			planet = "Neptune";
			pweight = Eweight*neptune;
		}
		else{
			planet = "unknown planet";
			pweight = 0;
			System.out.println("Error");
		}
		System.out.println("Your weight on " + planet + " is " + pweight + " pounds.");
	}
}

