package Music;

import Music.Song;

import java.util.ArrayList;
import java.util.List;

public class GenreMusical {

    private String[] name;
    private List<Song>songs;

    public GenreMusical(String[] name, List<Song>songs){
        this.name = name;
        this.songs = songs;
    }
}
