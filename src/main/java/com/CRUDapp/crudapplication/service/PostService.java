package com.CRUDapp.crudapplication.service;

import com.CRUDapp.crudapplication.model.Post;
import com.CRUDapp.crudapplication.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post savePost(Post post){
        return  postRepository.save(post);
    }

    public void deleteById(Long id){
        postRepository.deleteById(id);
    }

//    public Boolean existById(Long id){
//        return
//    }
}
