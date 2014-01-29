package com.tomtom.ejb.helloworld;

public class RssDocumentBuilder {

	private RssDocument doc = new RssDocument();
	
	public static RssDocumentBuilder builder(){
		return new RssDocumentBuilder();
	}

	public RssDocument build() {
		return doc;
	}
	
	public RssDocumentBuilder addTitle(String title) {
		doc.setTitle(title);
		return this;
	}


	public RssDocumentBuilder addAuthor(String author) {
		doc.setAuthor(author);
		return this;
	}
}
