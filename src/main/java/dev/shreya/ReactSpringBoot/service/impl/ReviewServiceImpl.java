package dev.shreya.ReactSpringBoot.service.impl;

import dev.shreya.ReactSpringBoot.collection.Movie;
import dev.shreya.ReactSpringBoot.collection.Review;
import dev.shreya.ReactSpringBoot.repository.ReviewRepository;
import dev.shreya.ReactSpringBoot.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

  @Autowired
  ReviewRepository reviewRepository;

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public Review createReview(String body, String imdbId) {
    Review review = reviewRepository.insert(new Review(body));
    mongoTemplate.update(Movie.class)
        .matching(Criteria.where("imdbId").is(imdbId))
        .apply(new Update().push("reviewIds").value(review))
        .first();
    return review;
  }
}
