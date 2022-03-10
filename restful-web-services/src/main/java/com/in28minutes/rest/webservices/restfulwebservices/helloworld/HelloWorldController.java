package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI (Uniform Resource Identifier) - /hello-world
    //method - "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public helloWorldBean helloWorldBean(){
        return new helloWorldBean("Hello World");
    }

    ///hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public helloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new helloWorldBean(String.format("Hello World, %s", name));
    }
}
