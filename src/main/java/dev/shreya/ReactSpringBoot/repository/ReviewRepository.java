package dev.shreya.ReactSpringBoot.repository;

import dev.shreya.ReactSpringBoot.collection.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
