package com.movie.api.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column(nullable = false)
    @NotBlank(message = "Please provide the movie name")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide the director name")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide the studio name")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "Movie_cast")
    private Set<String> movieName;

    @NotBlank(message = "Please provide the released Year")
    private Integer releasedYear;

    @Column(nullable = false)
    @NotBlank(message = "Please add poster")
    private String poster;


}
