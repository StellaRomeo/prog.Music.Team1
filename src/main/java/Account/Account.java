package Account;

import Music.Playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Account implements AccountOperation {

    private String id;
    protected String username;
    protected String password;
    protected String email;
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

    @Override
    public void createAccount() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void updateAccount() {

    }
}
