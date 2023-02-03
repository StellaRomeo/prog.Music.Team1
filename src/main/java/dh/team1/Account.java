package dh.team1;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private int id;
    private String username;
    private String password;
    private String email;
    private List<Playlist>playlists;

    public Account(int id, String username, String password, String email){
        this.id = id;
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.playlists = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
