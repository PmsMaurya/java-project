import java.util.Scanner;

public class scannermethod{
	public static void main (String[] args) {
		int a,b,c;
		System.out.println("Enter any two num :");
		Scanner pms=new Scanner(System.in);
		a=pms.nextInt();
		b=pms.nextInt();
		c=a+b;
		System.out.println("sum of two num is:"+c);
		}
	}