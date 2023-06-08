package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;

import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    // private static final Logger logger = LogManager.getLogger(HelloWorldController.class);
    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    @GetMapping("/hello")
    public String main(Model model) {

        // // pre-java 8
        // if (logger.isDebugEnabled()) {
        //     logger.debug("Hello from Log4j 2 - num : {}", num);
        // }

        // logger.debug("Hello from Log4j 2 - num : {}", () -> num);
        
        

        // String parameter = "test logging";
        // if (logger.isDebugEnabled()) {
        //     logger.debug("This is debug : " + parameter);
        // }

        // if (logger.isInfoEnabled()) {
        //     logger.info("This is info : " + parameter);
        // }

        // logger.warn("This is warn : " + parameter);
        // logger.error("This is error : " + parameter);
        // logger.fatal("This is fatal : " + parameter);
        // logger.info("This is my new log");
        

        model.addAttribute("tasks", num);

        return "Hello, World!";
    }
}
