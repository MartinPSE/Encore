package com.encore.vo;

public class Broker {
	private String date;
	private int price;
	private int count;
	private String ssn;
	private String stockname;
	
	
	public Broker() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Broker(String date, int price, int count, String ssn, String stockname) {
		super();
		this.date = date;
		this.price = price;
		this.count = count;
		this.ssn = ssn;
		this.stockname = stockname;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getStockname() {
		return stockname;
	}


	public void setStockname(String stockname) {
		this.stockname = stockname;
	}


	@Override
	public String toString() {
		return "Broker [date=" + date + ", price=" + price + ", count=" + count + ", ssn=" + ssn + ", stockname="
				+ stockname + "]";
	}
	
	
	
	
	
	

}
