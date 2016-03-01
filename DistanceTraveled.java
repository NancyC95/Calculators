import java.util.Scanner;
public class DistanceTraveled {
	public static void main(String[] args){
		double velocity, time, distance;
		velocity = time = distance = 0;
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter speed in miles per hour:");
		velocity = user_input.nextDouble();
		
		Scanner user_input2 = new Scanner(System.in);
		System.out.println("Enter time traveled in minutes");
		time = user_input2.nextDouble();
		
		distance = velocity * (time/60);
		
		System.out.println("You have traveled " + distance + " miles!");
		
				
	}

}
