package Account;

import Music.Album;
import Music.GenreMusical;
import Music.Song;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Artist{

    private String id;
    private String nameArtist;
    private GenreMusical genre;
    private Data carrierStartYear;
    private int numTracks;
    private  int numAlbum;
    private String nationality;
    private List<Album>albums;
    private List<Song>tracks;


    public Artist(String nameArtist,GenreMusical genre,Data carrierStartYear,
                  int numTracks, int numAlbum, String nationality) {
        this.nameArtist = nameArtist;
        this.genre = genre;
        this.carrierStartYear = carrierStartYear;
        this.numTracks = numTracks;
        this.numAlbum = numAlbum;
        this.nationality = nationality;
        this.albums = new ArrayList<>();
        this.tracks = new ArrayList<>();
        this.id = UUID.randomUUID().toString();
    }
}