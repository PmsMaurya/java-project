import java.util.Scanner;

public class do_whileloop {

	public static void main(String[] args) {
	int num;
	System.out.print("Enter any number:");
	Scanner s =new Scanner (System.in);
	num=s.nextInt();
  do
  {
	  
	System.out.print(num+" ");num++;
  }
  while( num<=10 );
	  
  
	}

}
