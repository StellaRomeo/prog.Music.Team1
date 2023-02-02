package dh.team1;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int id;
    private String username;
    private String password;
    private User user;
    private List<Playlist>playlists;

    public Account(int id, String username, String password, User user){
        this.id = id;
        this.username = username;
        this.password = password;
        this.user = user;
        this.playlists = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
