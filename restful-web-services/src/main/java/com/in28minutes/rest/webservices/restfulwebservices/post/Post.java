package com.in28minutes.rest.webservices.restfulwebservices.post;

public class Post {
    private Integer id;
    private String post;

    public Post(Integer id, String post) {
        this.id = id;
        this.post = post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", post='" + post + '\'' +
                '}';
    }
}
