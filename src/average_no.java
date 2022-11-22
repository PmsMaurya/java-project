//5.WAP in java to find the average of N numbers..
import java.util.Scanner;
public class average_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the numbers: ");
		 int n = sc.nextInt();
		   int sum = 0;
	   for(int i=0;i<n;i++){
		  sum += sc.nextInt();
		        }
		     double average = sum/(double)n; 
		        
		System.out.println("Average of n given numbers is "+average);
		        
		
		    }
		    
	
	

}
