package com.in28minutes.rest.webservices.restfulwebservices.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostDaoService postDaoService;

//    @GetMapping(path = "/users/{id}/posts")
//    public List<Post> retrieveAllPostsForUser(@PathVariable int id) {
//        List<Post> posts = postDaoService.findPostsForUser(id);
//        return posts;
//    }
//
//    @PostMapping(path = "/users/{id}/posts")
//    public ResponseEntity<Object> createPostForUser(@PathVariable int id, @RequestBody Post post) {
//        Post post1 = postDaoService.save(id, post);
//
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(post1.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//    }
//
//    @GetMapping(path = "/users/{id}/posts/{postId}")
//    public Post retrieveAllPostsForUser(@PathVariable int id, @PathVariable int postId) {
//        Post post = postDaoService.findPostForUser(id, postId);
//        return post;
//    }
}
