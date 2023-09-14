package com.movie.app.service.impl;

import com.movie.app.entity.Movie;
import com.movie.app.repository.MovieRepository;
import com.movie.app.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    public static final String CLASS_NAME = MovieServiceImpl.class.getName();

    @Autowired
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void saveAll(List<Movie> movies) {
        movieRepository.saveAll(movies);
    }
}
