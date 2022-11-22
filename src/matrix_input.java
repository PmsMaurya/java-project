import java.util.Scanner;

public class matrix_input {

	public static void main(String[] args) {
		
  System.out.print("enter the no of row:");
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  System.out.print("enter the  no.of col:");
  int col=sc.nextInt();
  int sum=0;
  int arr[][]=new int [row][col];
  for(int i=0;i<arr.length;i++) {
	  for(int j=0;j<arr[0].length;j++) {
		  arr[i][j]=sc.nextInt();
		 
	  }
  for(int i1=0;i1<arr.length;i1++) {
	  for(int j=0;j<arr[0].length;j++) {
		  System.out.print(arr[i1][j]);
		  System.out.println();
		     
		 
	  
	  System.out.print(sum);
	  
  }
  
	}

  }}}
