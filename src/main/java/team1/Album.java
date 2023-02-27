package team1;

import java.util.ArrayList;
import java.util.List;

public class Album {



    private String name;

    List<Song> albumSong;

    public void  addAlbumSong(Song song){
        albumSong.add(song);
    }
}