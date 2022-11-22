import java.util.*;
public class hill_pattern {

	public static void main(String[] args) {
		int n;
		System.out.print("enter the no.. row:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
