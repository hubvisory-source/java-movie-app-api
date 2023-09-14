package com.movie.app;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.app.entity.Movie;
import com.movie.app.service.MovieService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MovieAppApplication {

	static public void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MovieService movieService){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Movie>> typeReference = new TypeReference<>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/movies.json");
			try {
				List<Movie> movies = mapper.readValue(inputStream,typeReference);
				System.out.println(movies);
				movieService.saveAll(movies);
				System.out.println("Movies Saved!");
			} catch (IOException e){
				System.out.println("Unable to save movies: " + e.getMessage());
			}
		};
	}

}
