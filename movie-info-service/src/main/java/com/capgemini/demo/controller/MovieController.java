package com.capgemini.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.models.MovieModel;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@RequestMapping("/{movieId}")
    public MovieModel getMovieInfo(@PathVariable("movieId") String movieId) {
        return new MovieModel(movieId, "Name");

    }
}
