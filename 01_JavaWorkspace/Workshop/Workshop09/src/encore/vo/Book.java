package encore.vo;

public class Book {
	
	private String isbn;
	private String title;
	private int price;
	private int quantity;
	
	
	public Book(String isbn, String title, int price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Book() {}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
	
	

}
