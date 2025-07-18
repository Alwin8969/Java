
class Book{
	String title;
	String author;
	double price;
	
	Book(){
		title= "Unknown";
		author= "Not Assigned";
		price= 0.0;
	
	}
	public void displayDetails() {
		System.out.println("Titile:\t"+title);
		System.out.println("Author:\t"+author);
		System.out.println("Price:\t"+price);
	}
}

public class Hello {
	public static void main(String[] args) {
		Book book=new Book();
		book.displayDetails();
		
	}

}
	
