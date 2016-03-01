import java.util.Scanner;
public class P4 {
	public static void main(String[] args){
		double integer_1, integer_2, sum, diff, product, avg, distance, max, min;
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("1st integer:");
		integer_1 = user_input.nextDouble();
		
		Scanner user_input2 = new Scanner(System.in);
		System.out.println("2nd integer:");
		integer_2 = user_input2.nextDouble();
		
		sum = integer_1 + integer_2;
		diff = integer_1 - integer_2;
		product = integer_1 * integer_2;
		avg = sum/2;
		distance = Math.abs(diff);
		max = Math.max(integer_1, integer_2);
		min = Math.min(integer_1, integer_2);
		
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + product);
		System.out.println("Average: " + avg);
		System.out.println("Distance: " + distance);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		
		
		
		
		
		
	}
	

}
