import java.util.Scanner;

public class row_col_array {

	public static void main(String[] args) {
		int row,col;
Scanner sc=new Scanner(System.in);
 System.out.print("enter number of row:");
 row=sc.nextInt();
 System.out.print("enter number of col:");
 col=sc.nextInt();
 int arr[][]=new int [row][col];
 for(int i=0;i<row;i++) {
	 for(int j=0;j<col;j++) {
		 arr[i][j]=sc.nextInt();
	 }
	 
	 
 }
 System.out.println("Array is...");
 for(int i=0;i<row;i++) {
	 for(int j=0;j<col;j++) {
		 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
	}

}}
