package Account;

public class ArtistUser extends User{

    private Artist artist;

    public ArtistUser(String username, String password, String email, boolean isPlaying, boolean isStopping,
                      boolean isSkipping, boolean isPausing, boolean isRepeating, Artist artist) {
        super(username, password, email, isPlaying, isStopping, isSkipping, isPausing, isRepeating);
        this.artist = artist;
    }
}
