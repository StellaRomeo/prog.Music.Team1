package team1;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{



    private String password;

    public Admin(String password,String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);
        this.password=password;
    }






}
