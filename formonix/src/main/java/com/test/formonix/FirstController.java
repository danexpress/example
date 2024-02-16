package com.test.formonix;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FirstController {

    // @GetMapping("/hello")
    public String sayHello() {
        return "Hello from my first controller";
    }

    @GetMapping("/hello-2")
    public String sayHello2() {
        return "Hello 2 from my first controller";
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message) {
        return "Request accepted and message is: " + message;
    }

    @PostMapping("/post-order")
    public String post(
            @RequestBody Order order) {
        return "Request accepted and message is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String postRecord(
            @RequestBody OrderRecord order) {
        return "Request accepted and message is: " + order.toString();
    }

    @GetMapping("/hello/{user-name}")
    public String pathVar(
            @PathVariable("user-name") String userName) {
        return "my value =" + userName;
    }

    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String uselastrName) {
        return "my value =" + userName + " " + uselastrName;
    }

}
