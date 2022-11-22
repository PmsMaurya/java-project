import java.util.Scanner;

public class calculator_switchcase {

	public static void main(String[] args) {
		int a,b,c,ch;
		
		Scanner s=new Scanner(System.in);
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("5 for remainder");
		System.out.print("enter two number:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("enter your choice: ");
		ch=s.nextInt();
		switch(ch) {
		case 1:c=a+b;
		System.out.println("addition  "+c);
		break;
		case 2:c=a-b;
		System.out.println("Substraction  "+c);
		break;
		case 3:c=a*b;
		System.out.println("multiplication "+c);
		break;
		case 4:c=a/b;
		System.out.println("divide  "+c);
		break;
		case 5:c=a%b;
		System.out.println("remainder  "+c);
		break;
		default:System.out.print("Invalid choice");
		}
	}

}
