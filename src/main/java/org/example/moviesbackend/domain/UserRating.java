package org.example.moviesbackend.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_ratings")
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_rating_uid")
    private Long userRatingUid;

    @Column(name = "rating", nullable = false)
    private short rating;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "modified_at", nullable = false)
    private Date modifiedAt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_uid", nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movie_uid", nullable = false)
    private Movie movie;


}
