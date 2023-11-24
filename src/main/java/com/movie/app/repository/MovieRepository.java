package com.movie.app.repository;

import com.movie.app.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findFirst10ByReleaseDate(String releaseDate);
}
