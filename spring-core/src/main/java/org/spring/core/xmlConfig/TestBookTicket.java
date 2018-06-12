package org.spring.core.xmlConfig;

import org.spring.core.beans.BookaTicket;

public class TestBookTicket {

	public static void main(String[] args) {
		

		BookaTicket bookTicket = XmlContextUtil.getBean("bookTicket", BookaTicket.class);
		
		
		System.out.println(bookTicket.getMovieFinderService().getMovies());
		System.out.println(bookTicket.getMovieTheaterService().getTheaterServices());
	}

}
