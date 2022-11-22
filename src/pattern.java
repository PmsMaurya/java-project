import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		int i,j,n;
		System.out.print("Enter number:");
		Scanner s1=new Scanner (System.in);
		n=s1.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;++j) {
				
				System.out.print(j);
				
			}
			System.out.print("n");
			System.out.print("\n");
		}

	}

}
