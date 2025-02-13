package com.movie.model;

import org.springframework.data.annotation.Id;

public class UserDetails {
	
	@Id
	public String userId;

	public String username;
	
	public String movieId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public UserDetails(String userId, String username, String movieId) {
		super();
		this.userId = userId;
		this.username = username;
		this.movieId = movieId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	
	
}
