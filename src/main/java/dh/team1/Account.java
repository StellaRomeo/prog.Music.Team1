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
        this.username = username;
        this.password = password;
        this.email = email;
        this.playlists = new ArrayList<>();
    }



}
