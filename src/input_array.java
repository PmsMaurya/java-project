import java.util.Scanner;

public class input_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter size of array[]:");
		Scanner sc=new Scanner (System.in);
		int size = sc.nextInt();
		int sum=0;
   int number []=new int[size];
   for(int i=0;i<size;i++) {
	    number[i]=sc.nextInt();
	    sum+=number[i];
   }
   for (int i=0;i<size;i++) {
	   System.out.print(number[i]+" ");
	   
   }
   System.out.println(sum);
	}

}
