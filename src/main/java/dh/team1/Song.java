package dh.team1;


import javax.xml.crypto.Data;

public class Song extends MusicDetail {

    public Song(String title, Artist artist, GenreMusical genreMusical, int duration, Data dataCreation, int assessment) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
    }
}
