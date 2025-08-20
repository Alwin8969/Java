import java.util.Scanner;

public class CPU {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the words");
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		System.out.println(words.length);
		
	}
	

}
