import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,j,n;
 System.out.print("enter no.of row:");
 Scanner s2=new Scanner(System.in);
 n=s2.nextInt();
 
 for(i=1;i<=n;i++) {
	 for(j=i;j<=n;j++) {
		 
	System.out.print(j);
	 }
	 System.out.println();
 }
	}

}
