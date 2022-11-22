import java.util.Scanner;

public class calculator {
	

	public static void main(String[] args) {
		System.out.println("1.Addition:");
		System.out.println("2.Substraction:");
		System.out.println("3.Multiplication:");
		System.out.println("4.Divide");
		System.out.println("5.Remainder");
		int i,j,k,Pms;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any two no.:");
		i=sc.nextInt();
		j=sc.nextInt();
		System.out.print("enter your choice:");
		Pms=sc.nextInt();
		switch(Pms) {
		case 1:k=i+j;
		System.out.print(k);
		break;
		case 2:k=i-j;
		System.out.print(k);
		break;
		case 3:k=i*j;
		System.out.print(k);
		break;
		case 4:k=i/j;
		System.out.print(k);
		break;
		case 5:k=i%j;
		System.out.print(k);
		break;
		default: System.out.print("enter the valid choice..");
			
		
		}
		
	}

}
