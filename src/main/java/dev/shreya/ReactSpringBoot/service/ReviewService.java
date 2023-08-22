package dev.shreya.ReactSpringBoot.service;

import dev.shreya.ReactSpringBoot.collection.Review;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {

  public Review createReview(String body, String imdbId);
}
