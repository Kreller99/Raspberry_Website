package com.example.raspwebsite.repository;

import com.example.raspwebsite.model.Git;
import org.springframework.data.repository.CrudRepository;

public interface GitRepo extends CrudRepository<Git, Long> {
}
