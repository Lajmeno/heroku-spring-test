package de.neuefische.dockerspringtest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
@CrossOrigin
public class TestController {

    @GetMapping
    public String greet(){
        int num = (int)(Math.random() * 100);
        return "Day "+ num +": I am sailing on the great seas. Greetings from my Docker!";
    }
}
