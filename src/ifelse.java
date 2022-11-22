import java.util.Scanner;

public class ifelse {
	
	public static void main(String[] args) {
		int age;
	
		System.out.print("Enter your age :");
       Scanner P=new Scanner(System.in);
       age= P.nextInt();
    if(age >=18)
    {
    	System.out.print("you are eligible for vote");
    }
    else {
    	System.out.print("You are not eligible for vote ");
    }
	}

}
