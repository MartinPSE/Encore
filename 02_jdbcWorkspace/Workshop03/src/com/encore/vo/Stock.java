package com.encore.vo;

public class Stock {
	
	private String Stockname;
	private String stockinfo;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(String stockname, String stockinfo) {
		super();
		Stockname = stockname;
		this.stockinfo = stockinfo;
	}

	public String getStockname() {
		return Stockname;
	}

	public void setStockname(String stockname) {
		Stockname = stockname;
	}

	public String getStockinfo() {
		return stockinfo;
	}

	public void setStockinfo(String stockinfo) {
		this.stockinfo = stockinfo;
	}

	@Override
	public String toString() {
		return "Stock [Stockname=" + Stockname + ", stockinfo=" + stockinfo + "]";
	}
	
	
	
}
