import java.util.Scanner;

public class sum_natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			 sum=sum+i;
			
		}
        System.out.print(sum);
	}

}
