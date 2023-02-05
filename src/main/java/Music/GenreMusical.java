package Music;

import java.util.ArrayList;
import java.util.List;

public class GenreMusical {

    private String[] name;
    private List<Song>songs;

    public GenreMusical(String[] name){
        this.name = name;
        this.songs = new ArrayList<>();
    }
}
