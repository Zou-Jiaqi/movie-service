package org.jzou.mapper;

import org.jzou.dto.MovieDto;
import org.jzou.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre()
        );
    }
}
