import java.util.Scanner;
 class average{
	 public static void main(String []args) {
		 int n;
		 int sum=0;
		 System.out.print("enter the no.");
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 for(int i=0;i<n;i++) {
			 sum+=sc.nextInt();
		 }
		 double average=sum/(double) n;
		 System.out.print(average);
		 }
	 
 }