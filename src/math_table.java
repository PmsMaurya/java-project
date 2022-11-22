import java.util.Scanner;

public class math_table {

	public static void main(String[] args) {
		
         int n;
         System.out.print("enter the name of table:");
         Scanner s1=new Scanner (System.in);
         n=s1.nextInt();
         for(int i=1;i<=10;i++) {
        	 System.out.printf("%d * %d = %d\n",n,i,i*n);
        	
         }
	}

}
