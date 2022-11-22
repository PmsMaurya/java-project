import java.util.*;
public class table_Print {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the table no..");
		Scanner sc= new Scanner (System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d= %d\n",n,i,i*n);
		}

	}

}
