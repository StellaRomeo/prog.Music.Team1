package Music;


import Account.Artist;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Album extends MusicDetail {

    private Artist artistName;
    private List<Song>songList;


    public Album(String title, Artist artist, GenreMusical genreMusical, int duration, Data dataCreation, int assessment, Artist name) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
        this.artistName = name;
        this.songList = new ArrayList<>();
    }
}



