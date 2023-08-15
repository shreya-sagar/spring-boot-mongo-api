package dev.shreya.ReactSpringBoot.repository;

import dev.shreya.ReactSpringBoot.collection.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
