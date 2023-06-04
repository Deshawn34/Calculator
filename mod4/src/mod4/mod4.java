package mod4;
import java.util.*;

public class mod4 {
	

	public class Car {
		
		// Java Calculator Program
		public class Calculator {
			
			public static void main(String[] args) {
				
				int choice;
				String continu;
				double num1, num2;
				Scanner inp = new Scanner(System.in); // To read Input
				
				while(true) {
					
					System.out.println("\nSelect Operation\n1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4. DIVIDE");
					System.out.println("Choose (1, 2, 3, 4): ");
					choice = inp.nextInt();
							
					System.out.println("Enter First Number: ");
					num1 = inp.nextDouble();
					System.out.println("Enter Second Number: ");
					num2 = inp.nextDouble();
					
					if (choice == 1)
						System.out.println(num1+" + "+num2+ " = "+ add(num1, num2));
					else if (choice == 2)
						System.out.println(num1+ " - "+num2+ " = "+ subtract(num1, num2));
					else if (choice == 3)
						System.out.println(num1+ " * "+num2+ " = "+ multiply(num1, num2));
					else if (choice == 4)
						System.out.println(num1+ " / "+num2+ " = "+ divide(num1, num2));
					else
						System.out.println("Invalid Operation!");
					
					System.out.println("\nContinue? y/n ");
					continu = inp.next();
					if (continu.equals("n"))
						break;
				}
			}
			private static double add(double n1, double n2) {
				return n1 + n2;
			}
			private static double subtract(double n1, double n2) {
				return n1 - n2;
			}
			private static double multiply(double n1, double n2) {
				// TODO Auto-generated method stub
				return n1 * n2;
			}
			private static double divide(double n1, double n2) {
				if (n2 == 0) return 0;
				else return n1 / n2;
			}
		}
	}


}
