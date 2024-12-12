package com.movie.api.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Long movieId;

    @NotBlank(message = "Please provide the movie name")
    private String title;

    @NotBlank(message = "Please provide the director name")
    private String director;

    @NotBlank(message = "Please provide the studio name")
    private String studio;

    private Set<String> movieName;

    @NotBlank(message = "Please provide the released Year")
    private Integer releasedYear;

    @NotBlank(message = "Please add poster")
    private String poster;

    @NotBlank(message = "Please add posterUrl")
    private String posterUrl;
}
