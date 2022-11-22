import java.util.Scanner;

public class matrix_array {

	public static void main(String[] args) {
		
		System.out.println("2D array :");
		int[][] arr= {{1,2},{3,2},{4,5}};
		
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[0].length;j++) {
				if(i==0||i==arr.length-1)
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
