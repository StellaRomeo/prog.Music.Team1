package dh.team1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private List<Song>songList; // lista canzoni

    public Playlist(String name){
        this.name = name;
        this.songList = new ArrayList<>();
    }


}
