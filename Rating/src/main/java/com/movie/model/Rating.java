package com.movie.model;

public class Rating {
	
	public String moviename;
	
	public int rating;

	public Rating() {
		
	}
	
	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Rating(String moviename, int rating) {
		super();
		this.moviename = moviename;
		this.rating = rating;
	}

	
}
