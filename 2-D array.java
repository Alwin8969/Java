import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows and cols");
		int row=sc.nextInt();
		int cols=sc.nextInt();
		int[][] matrix= new int [row][cols];
		System.out.println(matrix.length);
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
