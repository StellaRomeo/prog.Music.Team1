package dh.team1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Account {

    private int id;
    private String username;
    private String password;
    private String email;
    private List<Playlist>playlists;

    public Account(int generateId, String username, String password, String email){
        this.id = generateId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.playlists = new ArrayList<>();
    }

    public String generateId(){
        return UUID.randomUUID().toString();  //identificatore univoco a livello globale
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



}
