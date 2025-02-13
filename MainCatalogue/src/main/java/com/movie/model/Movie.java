package com.movie.model;

public class Movie {
	
	public String movieId;
	
	public String moviename;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public Movie(String movieId, String moviename) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
	}
	
	

}
