package org.example.moviesbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cinematographers")
public class Cinematographer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinematographer_uid")
    private long cinematographerUid;

    @Column(name = "cinematographer_name", length = 30)
    private String cinematographerName;

    @JsonIgnore
    @OneToMany(mappedBy = "cinematographer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieCinematographerLink> MovieCinematographerLinkList = new ArrayList<>();
}
