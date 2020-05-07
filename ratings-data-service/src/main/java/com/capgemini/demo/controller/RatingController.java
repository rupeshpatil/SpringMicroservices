package com.capgemini.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.models.RatingModel;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
		
	@RequestMapping("/{movieId}")
    public RatingModel getRating(@PathVariable("movieId") String movieId) {
        return new RatingModel(movieId, 4);
    }
}
