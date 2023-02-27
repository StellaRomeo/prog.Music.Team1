package team1;

import java.util.List;
import java.util.Map;

public class User extends Person{



    private Map<Integer,Song> playlist;

    public User(String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);

    }

    public void addPlaylist(Song song, Integer index){
        playlist.put(index,song);
    }

}
