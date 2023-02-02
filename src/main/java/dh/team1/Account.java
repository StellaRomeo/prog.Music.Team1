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
}
