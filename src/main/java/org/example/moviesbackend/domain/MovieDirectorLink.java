package org.example.moviesbackend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie_director_links")
public class MovieDirectorLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_director_link_uid")
    private Long movieDirectorLinkUid;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movie_uid", nullable = false)
    private Movie movie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "director_uid", nullable = false)
    private Director director;
}
