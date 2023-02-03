package dh.team1;

import javax.xml.crypto.Data;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private int time;
    private Data dataProduction;

    public Song(String title, String artist,float time, Data dataProduction){
        this.title = title;
        this.artist = artist;
        this.time = time;
        this.dataProduction = dataProduction;

    }

    public void play(){
        System.out.println("Play song"+ " "+ title + " " + "di"+ artist);
    }

    public  void addSong(Song song){
        song.addSong(song); //agg. alla playlist
    }

}
