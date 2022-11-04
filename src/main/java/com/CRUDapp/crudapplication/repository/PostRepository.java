package com.CRUDapp.crudapplication.repository;

import com.CRUDapp.crudapplication.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
