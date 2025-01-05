package org.example.moviesbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_uid")
    private long movieUid;

    @Column(length = 150, nullable = false, name = "movieTitle", updatable = false)
    private String movieTitle;

    @Column(nullable = false, name = "release_date")
    private Date releaseDate;

    @Column(name = "runtime")
    private short runtime;

    @Column(length = 5, name = "audience_rating")
    private String audienceRating;

    @Column(length = 1500, name = "description")
    private String description;

    @Column(length = 1000, name = "poster_url")
    private String posterUrl;

    @Column(length = 1000, name = "backdrop_url")
    private String backdropUrl;

//    @Column(length = 45, name = "franchise")
//    private String franchise;

    @Column(name = "ratified")
    private boolean ratified = false;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "TMDB_id")
    private Long tMDBId;

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserRating> userRatingList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieGenreLink> movieGenreLinkList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieActorLink> movieActorLinkList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieDirectorLink> movieDirectorLinkList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieWriterLink> movieWriterLinkList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieCinematographerLink> movieCinnematographerLinkList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieMusicianLink> movieMusicianLinkList = new ArrayList<>();
}
