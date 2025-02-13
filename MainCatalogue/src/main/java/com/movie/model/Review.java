package com.movie.model;

import org.springframework.data.annotation.Id;

public class Review {


    @Id
    private Long id;

    private String userId;      
    private String movieId;     
    private int rating;         
    private String reviewText;
    
    public Review() {
    	
    }
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public Review(Long id, String userId, String movieId, int rating, String reviewText) {
		super();
		this.id = id;
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.reviewText = reviewText;
	}  
    
    

    
	
}
