
class Student{
	String name;
	int rollNumber;
	String department;
	Student(String name,int rollNumber,String department){
		this.name=name;
		this.rollNumber=rollNumber;
		this.department=department;
	}
	public void printStudentInfo() {
		System.out.println("Name:\t"+name);
		System.out.println("RollNumber:\t"+rollNumber);
		System.out.println("Department:\t"+department);
	}
	}
public class Demo2 {
	public static void main(String[] args) {
		Student student=new Student("Alwin",16,"CSE-B");
		student.printStudentInfo();
	}
}
