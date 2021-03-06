package com.tomtom.rsshub;

import java.io.StringReader;

import javax.ejb.Stateless;
import javax.inject.Named;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;

@Named
public class RssParser {

	public RssDocument parse(String rssPayload) throws IllegalArgumentException, FeedException{
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = input.build(new StringReader(rssPayload));
		RssDocument doc = RssDocumentBuilder.builder().addTitle(feed.getTitle()).addAuthor(feed.getAuthor()).build();
		
		return doc;
	}
	
}
