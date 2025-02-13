package com.movie.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Catalogue;
import com.movie.model.Movie;
import com.movie.model.UserDetails;
import com.movie.repo.MainCRepo;
import com.movie.service.MainService;

@RestController
@RequestMapping("/main")
public class CombineController {
	
	private static final String USER_ID = "userId";
	
	@Autowired
	private MainService mainService;
	
	//addd user details
	@PostMapping("/adduser")
	public String adduser(@RequestBody UserDetails userdetails) {
		
		mainService.savedetails(userdetails);
		
		return "data added successfully";
		
	}
	
	//get 
	@GetMapping("/{userId}")
	public List<Movie> getDetailes(@PathVariable(USER_ID) String userId){
		
		List<Movie> movie  =mainService.getReviewedMoviesByUser(userId);
		
		return movie;
	}
	
	

}
