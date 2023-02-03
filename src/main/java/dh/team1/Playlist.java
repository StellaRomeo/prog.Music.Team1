package dh.team1;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String title;
    private Data dataCreation; // data creazione
    private String genre; // genere musicale della playlist
    private User user; // utente che crea la playlist
    private List<Song>songList; // lista canzoni

    public Playlist(String title, String genre, Data dataCreation, User user){
        this.title = title;
        this.genre = genre;
        this.dataCreation = dataCreation;
        this.user = user;
        this.songList = new ArrayList<>();
    }


}
