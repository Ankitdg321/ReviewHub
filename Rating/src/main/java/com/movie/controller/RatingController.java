package com.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId ) {
		
		return new Rating(movieId, 4);
		
	}
	
}
