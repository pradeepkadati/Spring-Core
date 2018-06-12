package org.spring.core.beans;

public class BookaTicket {

	private MovieFinderService movieFinderService;
	private MovieTheaterServices movieTheaterService; 
	
	public BookaTicket(MovieFinderService service) {
		
		this.movieFinderService = service;
	}

	public MovieFinderService getMovieFinderService() {
		return movieFinderService;
	}

	
	public MovieTheaterServices getMovieTheaterService() {
		return movieTheaterService;
	}

	public void setMovieTheaterService(MovieTheaterServices movieTheaterService) {
		this.movieTheaterService = movieTheaterService;
	}
	
	
}
