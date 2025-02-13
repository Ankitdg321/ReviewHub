package com.movie.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.model.Catalogue;
import com.movie.model.Review;
import com.movie.model.UserDetails;

public interface MainCRepo extends JpaRepository<Catalogue, Long> {

	void save(UserDetails userdetails);
	
	List<Review> findByUserId(String userId);

	static List<Review> findAllById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
