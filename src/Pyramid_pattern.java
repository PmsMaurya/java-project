import java.util.Scanner;

class Pyramid_pattern{
	public static void main(String []args) {
		int i,n,j;
		System.out.print("enter the no.of row:");
		Scanner s1=new Scanner (System.in);
		n=s1.nextInt();
		for(i=0;i<n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(".");}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		
	}
}