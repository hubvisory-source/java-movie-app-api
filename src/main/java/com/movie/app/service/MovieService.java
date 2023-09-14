package com.movie.app.service;

import com.movie.app.entity.Movie;
import com.movie.app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MovieService {

    public Movie save(Movie user);

    public void saveAll(List<Movie> movies);
}
