package dh.team1;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Person{
   // private int Id;

    private String musicGenre;
    private String password;


    /**
     * Artist tracklist
     */
    private List<Song> braniInterpretatiList = new ArrayList<>();

    /**
     *
     * @param name of artist
     * @param surname of artist
     * @param nationality of artist
     * @param birthDay of artist
     * @param mail of artist
     * @param musicGenre of artist
     * @param password of artist
     * @param braniInterpretatiList of artist
     */


    public Artist(String name, String surname, String nationality, String birthDay, String mail,String musicGenre,String password, List<Song>braniInterpretatiList) {
        super(name, surname, nationality, birthDay, mail);
        this.musicGenre=musicGenre;
        this.password=password;
        this.braniInterpretatiList=braniInterpretatiList;
    }

    /**
     * method to add songs
     */

     public void addSong(String title,Song GenreTypeEnum,String executor,String writer,String productor,String source,String error){

        braniInterpretatiList.add( new Song(title,GenreTypeEnum,executor,writer,productor,source,error));
     }



    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Song> getBraniInterpretatiList() {
        return braniInterpretatiList;
    }

    public void setBraniInterpretatiList(List<Song> braniInterpretatiList) {
        this.braniInterpretatiList = braniInterpretatiList;
    }


}
