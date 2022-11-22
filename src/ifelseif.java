import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		int marks;
		System.out.print("enter your marks:");
		Scanner p=new Scanner(System.in);
		marks=p.nextInt();
		if(marks>=60 && marks<=100) {
			System.out.print("first division:");
			
		}
		else if(marks>=45 && marks<60) {
			System.out.print("second division:");
			
		}
		else if(marks>=33 && marks<45){
			System.out.print("third division:");
			
		}
		else {
			System.out.print("improve your self");
		}
	}

}
