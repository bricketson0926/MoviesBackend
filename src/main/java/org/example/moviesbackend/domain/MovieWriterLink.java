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
@Table(name = "Movie_writer_links")
public class MovieWriterLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_writer_link_uid")
    private Long movieWriterLinkUid;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movie_uid", nullable = false)
    private Movie movie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "writer_uid", nullable = false)
    private Writer writer;
}
