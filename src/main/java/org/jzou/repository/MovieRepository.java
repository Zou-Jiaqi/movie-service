package org.jzou.repository;

import org.jzou.domain.Genre;
import org.jzou.dto.MovieDto;
import org.jzou.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenre(Genre genre);

}
