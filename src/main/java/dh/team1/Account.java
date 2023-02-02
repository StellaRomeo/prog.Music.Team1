package dh.team1;

import javax.xml.crypto.Data;

public class Account {

    private int id;
    private String name;
    private Data birthData;
    private String bio;
    private String genre;

    public Account(int id, String name,Data birthData, String bio, String genre){
        this.id = id;
        this.name = name;
        this.birthData = birthData;
        this.bio = bio;
        this.genre = genre;
    }



}
