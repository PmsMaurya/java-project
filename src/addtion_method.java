/*3. WAP in java to create a class Addition 
 *and a method add() to ass two numbers.
 */
import java.util.*;
public class addtion_method {

	public static void main(String[] args) {
		
		
			 
			int x, y, add;  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter the first number: ");  
			x = sc.nextInt();  
			System.out.print("Enter the second number: ");  
			y = sc.nextInt();  
			add = add(x, y);  
			System.out.println("The sum of two numbers x and y is: " + add);  
			}  
			//method that calculates the sum  
			public static int add(int a, int b)  
			{  
			int add = a + b;  
			return add;  
			}  

	}


