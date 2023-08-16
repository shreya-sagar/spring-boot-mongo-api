package dev.shreya.ReactSpringBoot.service.impl;

import dev.shreya.ReactSpringBoot.collection.Movie;
import dev.shreya.ReactSpringBoot.repository.MovieRepository;
import dev.shreya.ReactSpringBoot.service.MovieService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Override
  public List<Movie> allMovies() {
    return movieRepository.findAll();
  }

  @Override
  public Optional<Movie> movieByImdbId(String imdbId) {
    return movieRepository.findMovieByImdbId(imdbId);
  }
}
