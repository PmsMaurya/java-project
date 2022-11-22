import java.util.*;
class max_min_array{
	public static void main(String[]args) {
		Scanner s2=new Scanner(System.in);
		System.out.print("enter the no. of row:");
		int row=s2.nextInt();
		System.out.print("enter the no. of col:");
		int col=s2.nextInt();
		int sum=0;
		int arr[][]=new int [row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s2.nextInt();
				sum+=arr[i][j];
			}
			
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print(sum);
	}
}