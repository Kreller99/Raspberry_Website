package com.example.raspwebsite.model;

public class Git {
    private Long id;
    private String repoName;
    private String repoLink;

    public Git(String repoName, String repoLink) {
        this.repoName = repoName;
        this.repoLink = repoLink;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoLink() {
        return repoLink;
    }

    public void setRepoLink(String repoLink) {
        this.repoLink = repoLink;
    }
}
