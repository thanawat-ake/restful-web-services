package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//Controller
@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping(path = "/hello-world-internationlized")
    public String helloWorldInternationlized(
//            @RequestHeader(name="Accept-Language", required = false) Locale locale
    ){
        return messageSource
                .getMessage("good.morning.message", null, "Default Message"
//                        , locale);
                        , LocaleContextHolder.getLocale());
//        return "Hello World";

        //en = Hello World
        //nl = Goede Morgen
        //fr = Bonjour
    }
}
