package com.tomtom.ejb.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.io.FeedException;

@WebServlet(urlPatterns = "/parse-rss")
public class Servlet extends HttpServlet {

	@EJB
	RssParser rssParser;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String rssPayload = req.getParameter("rss");
		
		PrintWriter writer = resp.getWriter();	
		try {
		
			writer.append(rssParser.parse(rssPayload).toString());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writer.flush();
		
	}
	
	

}
