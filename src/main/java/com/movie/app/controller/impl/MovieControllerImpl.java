package com.movie.app.controller.impl;

import com.movie.app.controller.MovieController;
import com.movie.app.entity.Movie;
import com.movie.app.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieControllerImpl implements MovieController {
    @Autowired
    private final MovieService service;

    MovieControllerImpl(MovieService service){
        this.service = service;
    }

    @GetMapping("/movies")
    @Override
    public List<Movie> all() {
        return new ArrayList<Movie>();
    }
}
