package dev.shreya.ReactSpringBoot.service;

import dev.shreya.ReactSpringBoot.collection.Movie;
import dev.shreya.ReactSpringBoot.repository.MovieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

  public List<Movie> allMovies();
}
