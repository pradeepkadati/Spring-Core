package org.spring.core.beans;

import java.util.List;

public class MovieLister {

	private MovieFinderService movieService;

	public MovieLister(MovieFinderService movieService) {
		
		this.movieService = movieService;
	}
	
	public List<String> getMoviesByCity(String city){
		
		return movieService.getMoviesByCity(city);
	}

}
