package org.jzou.service;

import org.jzou.domain.Genre;
import org.jzou.dto.MovieDto;
import org.jzou.entity.Movie;
import org.jzou.mapper.EntityDtoMapper;
import org.jzou.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<MovieDto> getAll() {
        return this.repository.findAll()
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

    public List<MovieDto> getAll(Genre genre) {
        return this.repository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }
}
