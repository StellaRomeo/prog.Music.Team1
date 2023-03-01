package team1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends Person{

    private Map< Artist,Song > prenotaSongUser = new HashMap<>();
  private int capienzaSongUser;

    //private Map<Integer,Song> playlistUser;

    public User(String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);

    }

    public void putSong(Song song, Artist artist){

        if (prenotaSongUser.size()<capienzaSongUser) {
            prenotaSongUser.putIfAbsent( artist,song);
        }

    }



}
