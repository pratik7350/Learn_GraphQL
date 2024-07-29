package com.graphql.bookdata;

public class BookInput {
	
	
	private String title;
	private String des;
	private int page;
	private int price;
	private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookInput [title=" + title + ", des=" + des + ", page=" + page + ", price=" + price + ", author="
				+ author + "]";
	}
	public BookInput(String title, String des, int page, int price, String author) {
		super();
		this.title = title;
		this.des = des;
		this.page = page;
		this.price = price;
		this.author = author;
	}
	public BookInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
