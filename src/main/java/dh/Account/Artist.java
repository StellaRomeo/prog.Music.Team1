package dh.Account;

import dh.content.Album;
import dh.content.Song;

import java.util.List;

public class Artist extends User{

    String artistName;
    String bio;
    List<Album> albumsOfArtist;
    List<Song> songOfArtist;
    int follower;
    List<User> usersFollowers;

    public Artist(String username, String email, String password, String name, String surname, String dateOfBirth, String gender, String nationality, int isAdmin) {
        super(username, email, password, name, surname, dateOfBirth, gender, nationality, isAdmin);
    }


    public String setBio(){
        String b= scanner.nextLine();
        return this.bio=b;
    }

    public int addFollower(){
        //this.usersFollowers.add(User);
        return this.follower++;
    }

    public int removeFollower(){
      //  this.usersFollowers.remove(User);
        return this.follower--;
    }
}
