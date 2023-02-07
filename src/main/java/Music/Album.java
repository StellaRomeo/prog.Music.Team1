package Music;


import Account.Artist;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album extends MusicDetail {

    private Artist artistName;
    private String immagine;
    private List<Song>songList;



    public Album(String title, Artist artist, GenreMusical genreMusical, int duration, Date dataCreation, int assessment, Artist name,String immagine) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
        this.artistName = name;
        this.immagine = immagine;
        this.songList = new ArrayList<>();
    }
}



