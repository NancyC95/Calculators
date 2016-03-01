import java.util.Scanner;
public class SafeSquareRoot {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to be square rooted: ");
		double n = keyboard.nextDouble();
		
		while (n < 0){
			System.out.println("You can't take a square root of a negative number! \nEnter a new number: ");
			n = keyboard.nextDouble();
		}
		if (n>=0){
			double ans = Math.sqrt(n);
			System.out.println("The square root of " + n + " is " + ans);
			}
		}
		
	}


