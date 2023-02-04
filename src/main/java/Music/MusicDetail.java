package Music;

import Account.Artist;

import javax.xml.crypto.Data;

public abstract class MusicDetail {    //song-playlist-album

    private String title;
    private Artist artist;
    private GenreMusical genreMusical;
    private int duration;
    private Data dataCreation;
    private int assessment; // valutazione 1-5


    public MusicDetail(String title, Artist artist, GenreMusical genreMusical, int duration, Data dataCreation, int assessment) {
        this.setTitle(title);
        this.setArtist(artist);
        this.setGenreMusical(genreMusical);
        this.setDuration(duration);
        this.setDataCreation(dataCreation);
        this.assessment = assessment;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public GenreMusical getGenreMusical() {
        return genreMusical;
    }

    public void setGenreMusical(GenreMusical genreMusical) {
        this.genreMusical = genreMusical;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Data getDataCreation() {
        return dataCreation;
    }

    public void setDataCreation(Data dataCreation) {
        this.dataCreation = dataCreation;
    }
}
