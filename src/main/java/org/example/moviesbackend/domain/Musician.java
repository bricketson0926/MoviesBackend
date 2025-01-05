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
@Table(name = "Musicians")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musician_uid")
    private long musicianUid;

    @Column(name = "musician_name", length = 30)
    private String musicianName;

    @JsonIgnore
    @OneToMany(mappedBy = "musician", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieMusicianLink> MovieMusicianLinkList = new ArrayList<>();
}
