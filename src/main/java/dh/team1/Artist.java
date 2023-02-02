package dh.team1;

import javax.xml.crypto.Data;
import java.util.List;

public class Artist {

    private int id;
    private String name;
    private Data birthData;
    private String bio;
    private String nationality;
    private String genre;


    public Artist (int id, String name,Data birthData, String bio,String nationality, String genre){
        this.id = id;
        this.name = name;
        this.birthData = birthData;
        this.bio = bio;
        this.nationality = nationality;
        this.genre = genre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getBirthData() {
        return birthData;
    }

    public void setBirthData(Data birthData) {
        this.birthData = birthData;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
