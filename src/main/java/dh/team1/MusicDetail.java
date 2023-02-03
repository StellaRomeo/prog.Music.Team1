package dh.team1;

import javax.xml.crypto.Data;

public abstract class MusicDetail {    //song-playlist-album

    private String title;
    private Artist artist;
    private GenreMusical genreMusical;
    private int duration;
    private Data dataCreation;
    private int assessment; // valutazione 1-5


    public MusicDetail(String title, Artist artist, GenreMusical genreMusical, int duration, Data dataCreation, int assessment) {
        this.title = title;
        this.artist = artist;
        this.genreMusical = genreMusical;
        this.duration = duration;
        this.dataCreation = dataCreation;
        this.assessment = assessment;
    }
}
