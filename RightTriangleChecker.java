import java.util.Scanner;
public class RightTriangleChecker {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int one, two, three;
		
		System.out.println("Right Triangle Checker!");
		System.out.println("Enter three integers :");
		System.out.println("Side 1: ");
		one = keyboard.nextInt();
		System.out.println("Side 2: ");
		two = keyboard.nextInt();
		
		while (one > two){
			System.out.println("Side 1 is larger than Side 2! Try again! \nSide 2: ");
			two = keyboard.nextInt();
		}
		System.out.println("Side 3: ");
		three = keyboard.nextInt();
		
		while (two > three){
			System.out.println("Side 2 is larger than Side 3! Try again! \nSide 3: ");
			three = keyboard.nextInt();
		}
		System.out.println("Your three sides are: " + one + " " + two + " " + three);
		if ((three*three) == ((one*one) + (two*two))){
			System.out.println("These sides DO make a right triangle!");
		}
		if ((three*three) != ((one*one) + (two*two))){
			System.out.println("These sides DO NOT make a right triangle!");
		}
		
		
	}

}
