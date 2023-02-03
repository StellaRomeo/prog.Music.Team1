package dh.team1;


import java.util.ArrayList;
import java.util.List;

public class Album extends MusicDetails {

    private Artist artistName;
    private List<Song>songList;

    public Album(Artist artistName){
        super();
        this.songList = new ArrayList<>();

    }


}
