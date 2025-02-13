package com.movie.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Movie;

public interface InfoRepo extends JpaRepository<Movie, String>{

	static List<Movie> findAllById(List<String> movieIds) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
