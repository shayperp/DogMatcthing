package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DogController {
    //Http://localhost:8080/dog
    @GetMapping("/dog")
    public Dog getDog(){
        return new Dog("Leo","Australian");

    }


}
