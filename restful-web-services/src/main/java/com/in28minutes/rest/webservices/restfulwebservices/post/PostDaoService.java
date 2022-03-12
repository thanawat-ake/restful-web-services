package com.in28minutes.rest.webservices.restfulwebservices.post;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// Manage by Spring
// PostDaoService will talk to JPA later.
@Component
public class PostDaoService {

    @Autowired
    private UserDaoService userDaoService;

//    public List<Post> findPostsForUser(int id) {
//        User user = userDaoService.findOne(id);
//        return user.getPosts();
//    }
//
//    public Post save(int userId, Post post){
//        User user = userDaoService.findOne(userId);
//        if(user != null) {
//            List<Post> posts = null;
//            if(post.getId() == null) {
//                posts = user.getPosts();
//                post.setId(posts.size() + 1);
//            }
//            posts.add(post);
//            user.setPosts(posts);
//            return post;
//        }
//        return null;
//    }
//
//    public Post findPostForUser(int userId, int postId) {
//        User user = userDaoService.findOne(userId);
//        if(user != null) {
//            for(Post post : user.getPosts()) {
//                if(post.getId() == postId){
//                    return post;
//                }
//            }
//        }
//        return null;
//    }

}
