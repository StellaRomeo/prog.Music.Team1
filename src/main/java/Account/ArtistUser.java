package Account;

import Music.Song;

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
            // inserisci la canzone qui
        }else{
            System.out.println("You don't have the rights to publish the songs");
        }
    }
}
