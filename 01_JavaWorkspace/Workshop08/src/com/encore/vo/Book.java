package com.encore.vo;

public class Book {
	
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private double price;
	private String desc;
	
	public Book() {};

	public Book(String isbn, String title, String author, String publisher, double price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return isbn + "," + title + "," + author + "," + publisher
				+ "," + price + "," + desc;
	}
	
	
	
	
	
	
		
	
			
		

}
