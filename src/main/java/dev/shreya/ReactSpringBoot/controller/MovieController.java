package dev.shreya.ReactSpringBoot.controller;

import dev.shreya.ReactSpringBoot.collection.Movie;
import dev.shreya.ReactSpringBoot.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;
  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies() {
    return ResponseEntity.ok(movieService.allMovies());
  }

}
