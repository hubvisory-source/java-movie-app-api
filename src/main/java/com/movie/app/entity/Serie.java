package com.movie.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="serie")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Serie {
    @Id
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name="adult")
    private boolean adult;

    @Column(name="backdrop_path")
    private String backdropPath;

    @Column(name="first_air_date")
    private String firstAirDate;

    @Column(name="name")
    private String name;

    @Column(name="original_language")
    private String originalLanguage;

    @Column(name="original_name")
    private String originalName;

    @Column(name="overview")
    private String overview;

    @Column(name="popularity")
    private double popularity;

    @Column(name="poster_path")
    private String posterPath;

    @Column(name="vote_average")
    private double voteAverage;

    private int voteCount;
}

/*
* {
      "backdrop_path": "/uDgy6hyPd82kOHh6I95FLtLnj6p.jpg",
      "first_air_date": "2023-01-15",
      "genre_ids": [18],
      "id": 100088,
      "name": "The Last of Us",
      "origin_country": ["US"],
      "original_language": "en",
      "original_name": "The Last of Us",
      "overview": "Twenty years after modern civilization has been destroyed, Joel, a hardened survivor, is hired to smuggle Ellie, a 14-year-old girl, out of an oppressive quarantine zone. What starts as a small job soon becomes a brutal, heartbreaking journey, as they both must traverse the United States and depend on each other for survival.",
      "popularity": 3795.042,
      "poster_path": "/uKvVjHNqB5VmOrdxqAt2F7J78ED.jpg",
      "vote_average": 8.8,
      "vote_count": 2389
    }
* */