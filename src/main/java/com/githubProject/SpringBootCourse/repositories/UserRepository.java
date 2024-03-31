package com.githubProject.SpringBootCourse.repositories;

import com.githubProject.SpringBootCourse.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
