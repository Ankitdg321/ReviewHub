package com.movie.model;


public class Catalogue {
	
	private String moviename;
	
	private String desc;
	
	private int rating;
	
	//def constructer to initialize the objects of this class
	public Catalogue() {
		
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	//para const
	public Catalogue(String moviename, String desc, int rating) {
		super();
		this.moviename = moviename;
		this.desc = desc;
		this.rating = rating;
	}
	
	

}
