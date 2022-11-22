import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter num");
		Scanner p=new Scanner(System.in);
		num=p.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println((num*i));
		}

	}

}
