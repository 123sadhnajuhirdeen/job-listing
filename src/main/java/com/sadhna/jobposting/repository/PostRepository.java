package com.sadhna.jobposting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sadhna.jobposting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
