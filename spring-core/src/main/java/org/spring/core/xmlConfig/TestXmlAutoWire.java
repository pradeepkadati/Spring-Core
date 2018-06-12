package org.spring.core.xmlConfig;

import org.spring.core.beans.BookaTicket;

public class TestXmlAutoWire {
 
	public static void main(String[] args) {
		

		BookaTicket bookTicket = XmlContextUtil.getBean("bookTicket-auto", BookaTicket.class);
		
		
		System.out.println(bookTicket.getMovieFinderService().getMovies());
		System.out.println(bookTicket.getMovieTheaterService().getTheaterServices());
		
		BookaTicket bookTicketByType = XmlContextUtil.getBean("bookTicket-byType", BookaTicket.class);
		
		
		System.out.println(bookTicketByType.getMovieFinderService().getMovies());
		System.out.println(bookTicketByType.getMovieTheaterService().getTheaterServices());
	}
}
