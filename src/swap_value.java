import java.util.Scanner;

class swap_value{
	public static void main(String []args) {
		int i,j,k;
		Scanner s1= new Scanner(System.in);
		System.out.print("enter the value of i:");
		
		i=s1.nextInt();
		System.out.print("enter the value of j:");
		j=s1.nextInt();
		k=i;
		i=j;
		j=k;
		System.out.print("value of i:"+i+"\n"+"value of j:"+j);
	}
}