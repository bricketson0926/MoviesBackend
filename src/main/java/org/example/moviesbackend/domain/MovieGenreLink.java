package org.example.moviesbackend.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie_genre_links")
public class MovieGenreLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_genre_link_uid")
    private Long movieGenreLinkUid;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movie_uid", nullable = false)
    private Movie movie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "genre_uid", nullable = false)
    private Genre genre;
}
