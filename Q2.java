package in.cdac;
import java.util.*;

public class Book{
	String title;
	String author;
	String publisher;
	String isbn;
	int year;
	double price;
	static int quantity;
	
    public Book(double price , int quantity) {
		this.price = price;
		Book.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		Book.quantity = quantity;
	}
    public static void increaseQuantity(int a) {
    	Book.quantity = Book.quantity+a;
    	System.out.println("Increased auantity of th book is: "+Book.quantity);
    }
    public static void decreaseQuantity(int b) {
    Book.quantity = Book.quantity-b;
    	System.out.println("Decreased auantity of th book is: "+Book.quantity);
}
    public void getInventoryValue(double c) {
    	c = price*Book.quantity;
    	System.out.println("Inventory value is: "+c);
    }
}

public class Q2 {
  private static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
	  Book b = new Book(250.5, 10);
	  System.out.println("Enter a price of book: ");
	  b.setPrice(sc.nextDouble());
	  b.getPrice();
	  System.out.println("Enter the quanity of books: ");
	  Book.setQuantity(sc.nextInt());
	  Book.getQuantity();
	  
	  Book.decreaseQuantity(6);
	  Book.increaseQuantity(3);
	  b.getInventoryValue(0);
	  
  }
}
