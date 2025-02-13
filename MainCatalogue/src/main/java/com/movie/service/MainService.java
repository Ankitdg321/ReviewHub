package com.movie.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.exception.MovieNotFoundException;
import com.movie.model.Movie;
import com.movie.model.Review;
import com.movie.model.UserDetails;
import com.movie.repo.InfoRepo;
import com.movie.repo.MainCRepo;

@Service
public class MainService {

	@Autowired
	private MainCRepo cRepo;
	
	@Autowired
	private InfoRepo infoRepo;
	
	//user details are saved
	public String savedetails(UserDetails userdetails) {
		
		cRepo.save(userdetails);
		
		return "data added successfully";
		
	}
	
	//get data from the userid
	  public List<Movie> getReviewedMoviesByUser(String userId) {
	        // Fetch all reviews for the user
	        List<Review> reviews = MainCRepo.findAllById(userId);

	        // Extract movieIds from the reviews
	        List<String> movieIds = reviews.stream()
	                                       .map(Review::getMovieId)
	                                       .collect(Collectors.toList());

	        // Fetch movie details based on the movieIds
	        
			try {
				List<Movie> movies = InfoRepo.findAllById(movieIds);
				if(movies != null) {
			        return movies;
				}else throw new  MovieNotFoundException(userId);
					
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        	// Return the list of movie details that the user has reviewed
	    }
	
	
	
}
	
	
