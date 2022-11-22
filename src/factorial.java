// 6.WAP in java to find the out factorial of a number..
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int i,n,fact=1;
		System.out.print("enter the number:");
		Scanner s2=new Scanner(System.in);
		n=s2.nextInt();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
         System.out.print(fact);
	}

}
