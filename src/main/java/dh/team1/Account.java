package dh.team1;

import javax.xml.crypto.Data;

public class Account {

    private int id;
    private String name;
    private Data birthData;
    private String bio;
    private String genre;

    public Account(int id, String name,Data birthData, String bio, String genre){
        this.setId(id);
        this.setName(name);
        this.setBirthData(birthData);
        this.setBio(bio);
        this.setGenre(genre);
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
