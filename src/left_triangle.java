import java.util.Scanner;

class left_triangle {
	public static void main(String[]args) {
		int i,n,j;
		System.out.print("enter the no.of row:");
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) 
			{
				System.out.print(" ");
				
			}
			 for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}