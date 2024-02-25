package com.sadhna.jobposting.repository;

import java.util.List;


import com.sadhna.jobposting.model.Post;

public interface SearchRepository {

	List<Post> findByText(String text);

}
