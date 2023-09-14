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
@Table(name="movie")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    @Id
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name="adult")
    private boolean adult;

    @Column(name="backdrop_path")
    @JsonProperty("backdrop_path")
    private String backdropPath;

    @Column(name="original_length")
    @JsonProperty("original_length")
    private String originalLength;

    @Column(name="original_title")
    @JsonProperty("original_title")
    private String originalTitle;

    @Column(name="overview", columnDefinition="TEXT", length = 2048)
    private String overview;

    @Column(name="popularity")
    private double popularity;

    @Column(name="poster_path")
    @JsonProperty("poster_path")
    private String posterPath;

    @Column(name="release_date")
    @JsonProperty("release_date")
    private String releaseDate;

    @Column(name="title")
    private String title;

    @Column(name="video")
    private boolean video;

    @Column(name="vote_average")
    @JsonProperty("vote_average")
    private double voteAverage;

    @Column(name="vote_count")
    @JsonProperty("vote_count")
    private int voteCount;
}

/*
* "adult": false,
      "backdrop_path": "/22z44LPkMyf5nyyXvv8qQLsbom.jpg",
      "genre_ids": [27, 9648, 53],
      "id": 631842,
      "original_language": "en",
      "original_title": "Knock at the Cabin",
      "overview": "While vacationing at a remote cabin, a young girl and her two fathers are taken hostage by four armed strangers who demand that the family make an unthinkable choice to avert the apocalypse. With limited access to the outside world, the family must decide what they believe before all is lost.",
      "popularity": 2617.181,
      "poster_path": "/dm06L9pxDOL9jNSK4Cb6y139rrG.jpg",
      "release_date": "2023-02-01",
      "title": "Knock at the Cabin",
      "video": false,
      "vote_average": 6.5,
      "vote_count": 923*/