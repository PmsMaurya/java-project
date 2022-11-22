package labFileJava;
import java.util.*;
public class perimeter {

	public static void main(String[] args) {
		int a,b,perimeter;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the length:");
		a=sc.nextInt();
		System.out.println("enter the breadth:");
		b=sc.nextInt();
		perimeter=2*(a+b);
		System.out.println("Perimeter:"+perimeter);
		
	}

}
