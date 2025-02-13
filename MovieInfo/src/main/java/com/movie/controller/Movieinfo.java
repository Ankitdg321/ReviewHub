package com.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;

@RestController
@RequestMapping("/info")
public class Movieinfo {

	@GetMapping("/{movieId}")
	public Movie getmovieinfo(@PathVariable("movieid") String movieId ) {
		
		return new Movie(movieId, "DDLJ");
		
	}
	
}
