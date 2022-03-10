package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class helloWorldBean {
    private final String message;

    public helloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String setMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "helloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
