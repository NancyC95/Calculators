import java.util.Scanner;
public class AddinginLoop {
	public static void main(String[] args) {
		int num, num2;
		num = 0;
		num2 = -1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will add all your numbers. Enter 0 when you want to stop");
		System.out.println("Number: ");
		num = keyboard.nextInt();
		while (num2 != 0){
			System.out.println("Enter new number: " );
			num2 = keyboard.nextInt();
			num = num2 + num; 
			System.out.println("Total: " + num);
		}

		}

}
