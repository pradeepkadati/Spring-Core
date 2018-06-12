package org.spring.core.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieFinderService {

	private Map<String,List<String>> moviesByLocation;
	
	public void init() {
		moviesByLocation = new HashMap<>();
		moviesByLocation.put("hyd", Arrays.asList("movie1","movie2"));
		moviesByLocation.put("blr", Arrays.asList("movie1","movie2","movie3","movie4"));
		moviesByLocation.put("mum", Arrays.asList("movie1","movie2","movie3","movie4"));
		moviesByLocation.put("chn", Arrays.asList("movie1","movie2","movie4","movie6"));
	}
	
	public List<String> getMoviesByCity(String city){
		
		return moviesByLocation.get(city);
	}
	
	public Map<String,List<String>> getMovies(){
		return moviesByLocation;
	}
}
