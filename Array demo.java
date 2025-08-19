import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("The given array");
		for(int num:array){
			System.out.println(num+"\t");
		}
		//largest element
		int largest=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("The largest elemt in the array is");
		System.out.println(largest);
		}

}
