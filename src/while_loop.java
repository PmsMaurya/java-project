import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number");
		Scanner p=new Scanner (System.in);
		num=p.nextInt();
		while (num>=0) {
			if(num%2==0) {
				System.out.print(" is even number : ");
				break;
			}
			else {
				System.out.print("is odd number :");
				break;
			}
		}

	}

}
