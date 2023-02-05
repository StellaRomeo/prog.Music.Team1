package Account;

import Music.Song;

/**
 * the ArtistUser class which extends the User class and represents the user who has the ability to publish their music
 */
public class ArtistUser extends User{

    private Artist artistUser;

    public ArtistUser(String username, String password, String email, boolean isPlaying, boolean isStopping,
                      boolean isSkipping, boolean isPausing, boolean isRepeating, Artist artist) {
        super(username, password, email, isPlaying, isStopping, isSkipping, isPausing, isRepeating);
        this.artistUser = artist;
    }

    public Artist getArtist(){
        return artistUser;
    }
    public void publishSong(Song song){
        if (artistUser.isAdding && artistUser.hasRightsToAddSong){
            System.out.println("Publish the song");
            // Salvare la canzone in un database o file system()
            System.out.println("Song released successfully!");
        }else{
            System.out.println("You don't have the rights to publish the songs");
        }
    }
}
