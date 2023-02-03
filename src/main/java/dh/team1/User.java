package dh.team1;

import javax.xml.crypto.Data;

public class User extends Account {

    private String name;
    private String surname;
    private Data dataBorn;
    private String gender;
    private String nationality;
    private String address;
    private String city;
    private String country;



    public User(int id, String username, String password, String email, String name,String surname, Data dataBorn,String gender,
                String nationality, String address, String city, String country) {
        super(id, username, password, email);
        this.name = name;
        this.surname = surname;
        this.dataBorn = dataBorn;
        this.gender = gender;
        this.nationality = nationality;
        this.address = address;
        this.city = city;
        this.country = country;
    }
}
