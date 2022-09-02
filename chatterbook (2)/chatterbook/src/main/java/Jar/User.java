package Jar;

import java.util.ArrayList;
import java.util.List;

public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }

    private List<ChatterPost> chatterPosts = new ArrayList<>();
}
