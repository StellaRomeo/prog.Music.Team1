package Music;

import Account.Admin;
import Account.Artist;
import Account.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Playlist extends MusicDetail {

    private User admin;
    protected List<Song>songList;


    public Playlist(String title, Artist artist, GenreMusical genreMusical, int duration, Date dataCreation, int assessment,
                    User admin) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
        this.admin = admin;
        this.songList = new ArrayList<>();
    }
}
