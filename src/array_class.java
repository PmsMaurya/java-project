import java.util.*;
class array_class{
	public static void main(String []args) {
		int n;
		System.out.print("enter the size of array:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("output of array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}