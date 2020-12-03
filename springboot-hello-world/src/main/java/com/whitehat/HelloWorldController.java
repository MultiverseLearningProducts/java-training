package com.whitehat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the RESTful API supported by this SpringBoot application.
 */
@RestController
public class HelloWorldController {

    @GetMapping(value={"/hello"}, produces = MediaType.APPLICATION_JSON_VALUE)
    String sayHello() {
        return("{\"message\":\"hello from Spring Boot!\"}");
    }

}
