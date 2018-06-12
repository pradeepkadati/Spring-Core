package org.spring.core.xmlConfig;

import org.spring.core.beans.MovieLister;

/**
 *  Example for constructor based injection
 * @author pradeep
 *
 */
public class TestMovieLister {

	public static void main(String[] args) {
		

		MovieLister movieLister = XmlContextUtil.getBean("movieLister", MovieLister.class);
		
		System.out.println(movieLister.getMoviesByCity("hyd"));
	}

}
