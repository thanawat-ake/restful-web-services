package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.in28minutes.rest.webservices.restfulwebservices.post.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Manage by Spring
// UserDaoService will talk to JPA later.
@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    private static List<Post> posts = new ArrayList<>();

    static {
        posts.add(new Post(1,"I am happy today."));
        posts.add(new Post(2,"Today is my birthday."));
        posts.add(new Post(3,"Tomorrow is Saturday."));
        users.add(new User(1, "Adam", new Date(), posts));
        users.add(new User(2, "Eve", new Date(), posts));
        users.add(new User(3, "Jack", new Date(), posts));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public String delete(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                users.remove(user);
                return "Deleted user id : " + id;
            }
        }
        return "Not found user id : " + id;
    }

}
