package com.githubProject.SpringBootCourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.githubProject.SpringBootCourse.entities.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Pedro", "pedro@gmail.com", "99999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}