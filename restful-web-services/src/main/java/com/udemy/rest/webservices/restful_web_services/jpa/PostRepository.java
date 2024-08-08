package com.udemy.rest.webservices.restful_web_services.jpa;

import com.udemy.rest.webservices.restful_web_services.user.Post;
import com.udemy.rest.webservices.restful_web_services.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
