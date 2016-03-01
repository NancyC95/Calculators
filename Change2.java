import java.util.Scanner;
public class Change2 {
    
 int amt = 0;
 int numQ = 0;
 int numD = 0;
 int numN = 0;
 int numP = 0;
 
 public int changeQ(int x){
  amt = x;
  numQ = amt/25;
  amt = amt%25;
  return numQ;
 }
 public int changeD(int x){
  amt = x%25;
  numD = amt/10;
  amt = amt%10;
  return numD;
 }
 public int changeN(int x){
  amt = x%25%10;
  numQ = amt/5;
  amt = amt%5;
  return numQ;
 }
 public int changeP(int x){
  numP = x%25%10%5;
  return numP;
 }
 
 public static void main(String[] args){
  int x;
  Change2 c = new Change2();
  System.out.println("Enter the amount of change in cents");
  Scanner user_input = new Scanner(System.in);
  x = user_input.nextInt();
  
  System.out.println("Number of quarters: " + c.changeQ(x));
  System.out.println("Number of dimes: " + c.changeD(x));
  System.out.println("Number of nickels: " + c.changeN(x));
  System.out.println("Number of pennies: " + c.changeP(x));
}
}