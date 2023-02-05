package Music;

import Account.Artist;
import Account.User;
import java.util.Date;


public class PlaylistPublic extends Playlist{

    public PlaylistPublic(String title, Artist artist, GenreMusical genreMusical, int duration, Date dataCreation, int assessment, User user) {
        super(title, artist, genreMusical, duration, dataCreation, assessment, user);
    }
}
