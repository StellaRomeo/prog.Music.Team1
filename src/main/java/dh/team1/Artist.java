package dh.team1;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Person{


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int Id;


    public Artist(int Id,String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);
        this.Id=Id;
    }


    List<String> artistList=new ArrayList<String>();
}
