/*package com.example.raspwebsite.service;


import com.example.raspwebsite.model.Git;
import com.example.raspwebsite.repository.GitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class GitService {
    Git git;

    @Autowired
    GitRepo gitRepo;

    public Iterable<Git> findGit() throws NullPointerException {
        gitRepo.findAll();
        return null;
    }

    public Git saveGit() throws NullPointerException {
        gitRepo.save(git);
        return git;
    }

    public Set<Git> findAll() {
        Set<Git> gitList = new HashSet<>();
        for (Git git : gitRepo.findAll()) {
            gitList.add(git);
        }
        return gitList;
    }

    public Git findById(Long id) {
        //findById giver en optional
        Optional<Git> gitOptional = gitRepo.findById(id);
        //hvis der ikke findes et Git på id, kastes der en fejl
        if (!gitOptional.isPresent()) {
            throw new RuntimeException("Git not found");
        }
        //returner Git vha. .get()
        return gitOptional.get();
    }

    public void create(Git git) {
        gitRepo.save(git);
    }

    public void update(Git git) {
        gitRepo.save(git);
    }

    public void delete(Long id) {
        gitRepo.deleteById(id);
    }


}
*/
