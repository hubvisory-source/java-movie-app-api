package com.movie.app.controller;

import com.movie.app.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface MovieController {
    @GetMapping("/movies")
    List<Movie> all();
}
