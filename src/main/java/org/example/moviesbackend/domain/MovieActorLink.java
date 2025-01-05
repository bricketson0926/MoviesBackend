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
@Table(name = "Movie_actor_links")
public class MovieActorLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_actor_link_uid")
    private Long movieActorLinkUid;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movie_uid", nullable = false)
    private Movie movie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "actor_uid", nullable = false)
    private Actor actor;
}
