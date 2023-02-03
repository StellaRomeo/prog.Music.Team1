package dh.team1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Account {

    private String id;
    private String username;
    private String password;
    private String email;
    private List<Playlist>playlists;

    public Account(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = UUID.randomUUID().toString();
        this.playlists = new ArrayList<>();
    }

    public String getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }


    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }
    public  void removePlaylist(Playlist playlist){
        playlists.remove(playlist);
    }



}
