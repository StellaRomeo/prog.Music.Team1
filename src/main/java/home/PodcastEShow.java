package home;

import team1.Artist;
import team1.Song;

import java.util.List;

public class PodcastEShow {

    public String dataPlay;
    Song song;
    Artist artist;
    public List<PodcastEShow> podcastEShowList;

    public PodcastEShow(String dataPlay, Song song, Artist artist) {
        this.dataPlay = dataPlay;
        this.song = song;
        this.artist = artist;
    }




}
