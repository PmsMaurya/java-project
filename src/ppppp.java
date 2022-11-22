import java.util.Scanner;

public class ppppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;
         System.out.print("enter the no. of limit:");
         Scanner s1=new Scanner(System.in);
         n=s1.nextInt();
         for(int i=1;i<=n;i++) {
        	 if(i%2==0) {
        		 System.out.println("even no.:-"+i);
        		 
        	 }
        	 else {
        		 System.out.println("odd no..:-"+i);
        		 
        	 }
         }
	}

}
