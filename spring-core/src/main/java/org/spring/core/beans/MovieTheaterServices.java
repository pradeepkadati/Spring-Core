package org.spring.core.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieTheaterServices {

	private Map<String,List<String>> theaterFacilities;
	
	public MovieTheaterServices() {
		
		theaterFacilities = new HashMap<>();
		
		theaterFacilities.put("T1", Arrays.asList("Parking","Children Play area","restaurants"));
		theaterFacilities.put("T2", Arrays.asList("Parking","Children Play area","restaurants","coffee day"));
		theaterFacilities.put("T3", Arrays.asList("Parking"));
	}
	
	public Map<String,List<String>> getTheaterServices(){
		
		return theaterFacilities;
	}
}
