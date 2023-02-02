package dh.team1;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private Data dataCreation; // data creazione
    private String genre; // genere musicale della playlist
    private User user; // utente che crea la playlist
    private List<Song>songList; // lista canzoni

    public Playlist(String name, String genre, Data dataCreation, User user){
        this.name = name;
        this.genre = genre;
        this.dataCreation = dataCreation;
        this.user = user;
        this.songList = new ArrayList<>();
    }


}
