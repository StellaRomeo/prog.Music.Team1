package Music;


import Account.Admin;
import Account.Artist;
import Account.User;
import java.util.Date;


public class Song extends MusicDetail implements MusicOperation {

    private User user; //Vedi Carlo
    private Admin admin;

    public Song(String title, Artist artist, GenreMusical genreMusical, int duration, Date dataCreation, int assessment, User user, Admin admin) {
        super(title, artist, genreMusical, duration, dataCreation, assessment);
        this.user = user;
        this.admin = admin;
    }


    @Override
    public void play() {
        while (true){
            if (user.isPlaying == true || admin.isPlaying == true){
                System.out.printf("The song %s of the artist %s is playing ", getTitle(),getArtist());
            } else {
            System.out.printf("The song %s of the artist %s is not playing ", getTitle(),getArtist());
        }
        }
    }


    @Override
    public void stop() {
        while (true){
            if (user.isStopping == true || admin.isStopping == true){
                System.out.printf("The song %s of the artist %s is playing ", getTitle(),getArtist());
            } else {
                System.out.printf("The song %s of the artist %s is not stopping ", getTitle(),getArtist());
            }
    }



    }

    @Override
    public void skip() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void repeat() {

    }

    @Override
    public void shuffle() {

    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void like() {

    }

    @Override
    public void dislike() {

    }

    @Override
    public void search() {

    }
}
