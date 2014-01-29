package com.tomtom.ejb.helloworld;


public class RssDocument {
	private String title;

	private String author;
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	@Override
	public String toString() {	
		return "title:" +title+" author:"+author;
	}

	

}
