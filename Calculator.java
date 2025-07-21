/* 
 * Title: Calculator
 * Author : Alwin Joshy
 * Date : 21/07/2025
 */
package prgms;
class Calculator{
	public void add(int a,int b){
		int sum=a+ b;
		System.out.println("Sum: \t"+sum);
	}
	public void add(int c,int d,int e ){
		int sum=c+d+e;
		System.out.println("Sum: \t"+sum);
	}
	public void add(double f,double g) {
		double sum=f+g;
		System.out.println("Sum: \t"+sum);
	}
}


public class Demo {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add(10, 20);
		calculator.add(10, 20, 30);
		calculator.add(2.5, 3.5);
		
	}

}
