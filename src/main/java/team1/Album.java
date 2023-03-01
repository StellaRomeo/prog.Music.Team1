package team1;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Maria Coman
 */
public class Album {



    private String name;
    Song song ;
    private int numberSong;

    List<Song> listAlbum=new ArrayList<Song>();



    public Album(String name, Song song, int numberSong) {
        this.name = name;
        this.song = song;
        this.numberSong = numberSong;
    }

    public void  addAlbumSong(Song song){listAlbum.add(song);
        if(listAlbum.size()<numberSong){
            listAlbum.addAll(listAlbum);
        }


    }
}