package com.miltonrafael.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miltonrafael.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}