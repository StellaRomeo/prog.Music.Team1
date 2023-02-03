package Account;

import Music.Album;
import Music.GenreMusical;
import Music.Song;

import javax.xml.crypto.Data;
import java.util.List;

public class Artist {

    private int id;
    private String name;
    private GenreMusical genre;
    private Data carrierStartYear;
    private int numTracks;
    private  int numAlbum;
    private String nationality;
    private List<Album>albums;
    private List<Song>tracks;


}