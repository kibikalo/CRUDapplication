package com.CRUDapp.crudapplication.contoller;

import com.CRUDapp.crudapplication.model.Post;
import com.CRUDapp.crudapplication.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "note-list";
    }

    @GetMapping("/create-note")
    public String createPostForm(Post post) {
        return "create-note";
    }

    @PostMapping("/create-note")
    public String createPost(Post post) {
        postService.savePost(post);
        return "redirect:/";
    }

    @GetMapping("delete-note/{id}")
    public String deletePost(@PathVariable("id") Long id) {
        postService.deleteById(id);
        return "redirect:/";
    }
}
