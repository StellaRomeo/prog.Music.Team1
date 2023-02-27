package team1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Artist extends Person{

    private GenereTypeEnum musicGenre;
    private String password;

    /**
     * Artist tracklist
     */
    private List<Song> artistSongList = new ArrayList<>();
    private Map<Integer,Album> albumArtistMap;


    /**
     *
     * @param name of artist
     * @param surname of artist
     * @param nationality of artist
     * @param birthDay of artist
     * @param mail of artist
     * @param musicGenre of artist
     * @param password of artist
     *
     */


    public Artist(String name, String surname, String nationality,
                  String birthDay, String mail,GenereTypeEnum musicGenre,
                  String password ) {
        super(name, surname, nationality, birthDay, mail);
        this.musicGenre=musicGenre;
        this.password=password;

    }

    /**
     * method to add songs
     */

     public void addSong(String title,GenereTypeEnum musicGenre,String executor,String writer,String productor,String source,String dateOfCreation) {
         artistSongList.add(new Song(title, musicGenre, executor, writer, productor, source, dateOfCreation));
     }
    public void artistAddSong(String title, GenereTypeEnum songGenre,
                              String writer, String productor,String dateOfCreation){
         artistSongList.add(new Song(title,songGenre,writer,productor, dateOfCreation));
    }
    public void addAlbum(Integer index,Album album){
        albumArtistMap.put(index,album);
    };


    public GenereTypeEnum getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(GenereTypeEnum musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Song> getArtistSongList() {
        return artistSongList;
    }

    public void setArtistSongList(List<Song> artistSongList) {
        this.artistSongList = artistSongList;
    }


}
