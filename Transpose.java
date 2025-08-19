import java.util.Scanner;
public class Transpose {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows & cols");
		int row=sc.nextInt();
		int cols=sc.nextInt();
		int [][] matrix=new int[row][cols];
		  System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	}
	        }
	        int [][] transpose=new int[cols][row];
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < cols; j++) {
	            	transpose[j][i]=sc.nextInt();
	            }
	        }
	        System.out.println("Transposed Matrix");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < cols; j++) {
	            	System.out.print(transpose[j][i]+"\t");
	            	
	            }
	        System.out.println();
	}
	
}
}
