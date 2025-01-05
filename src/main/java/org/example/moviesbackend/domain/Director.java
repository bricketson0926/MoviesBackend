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
@Table(name = "Directors")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "director_uid")
    private long directorUid;

    @Column(name = "director_name", length = 30)
    private String directorName;

    @JsonIgnore
    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieDirectorLink> MovieDirectorLinkList = new ArrayList<>();
}
