package com.jubayir.retrofitcomments;

public class User {
    private int postId;
    private int id;
    private String name;
    private String title;
    private String body;

    public User() {
    }

    public User(int postId, int id, String name, String title, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.title = title;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
