package com.githubProject.SpringBootCourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.githubProject.SpringBootCourse.entities.User;

@RestController
@RequestMapping(value = "/t")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Pedro", "pedro@gmail.com", "3199999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
