/* Name:ALwin Joshy
 * Title:Using Extender
 * Date:08/08/25
 */



class Book{
	String title;
	String author;
	double price;
Book(String title,String author,double price){
	this.title = title;
	this.author=author;
	this.price=price;
	
}
public void displaydetails() {
	System.out.println("Title:"+ title);
	System.out.println("Author:"+ author);
	System.out.println("Price:"+price);
}
}

class Ebook extends Book{
	double filesizeMB;
	Ebook(String title,String author,double price,double filesizeMB){
		super(title,author,price);
		this.filesizeMB=filesizeMB;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("FileSizeMB:"+filesizeMB);
		
	}
}
	class PrintedBook extends Book{
		int numberOfPages;
		PrintedBook(String title, String author, double price, int numberOfPages) {
	        super(title, author, price); 
	        this.numberOfPages = numberOfPages;
	}
	public void displaydetails() {
	    super.displaydetails();
	       System.out.println("Number of Pages: " + numberOfPages);
	    }
	}
public class Extender {
	public static void main(String[] args) {
		Ebook ebook= new Ebook("Java","AJ",100,55.5);
		PrintedBook printedbook=new PrintedBook("C","AM",200,150);
		
		System.out.println("Ebook Detaails");
		ebook.displaydetails();
		System.out.println("Printed Book Details");
		printedbook.displaydetails();
	}
}
