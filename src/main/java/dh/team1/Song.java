package dh.team1;

public class Song {
    private String title;
    private String artist;
    private float time;

    public Song(String title, String artist,float time){
        this.title = title;
        this.artist = artist;
        this.time = time;
    }

    public void play(){
        System.out.println("Play song"+ " "+ title + " " + "di"+ artist);
    }

}
