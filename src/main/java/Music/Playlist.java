package Music;

import Account.Artist;
import Account.User;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Playlist extends MusicDetail {

    private User user;
    private List<Song>songList;


    public Playlist(String title, Artist artist, GenreMusical genreMusical, int duration, Data dataCreation, int assessment,
                    User user) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
        this.user = user;
        this.songList = new ArrayList<>();
    }
}
