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
        this.setName(name);
        this.setSurname(surname);
        this.setDataBorn(dataBorn);
        this.setGender(gender);
        this.setNationality(nationality);
        this.setAddress(address);
        this.setCity(city);
        this.setCountry(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Data getDataBorn() {
        return dataBorn;
    }

    public void setDataBorn(Data dataBorn) {
        this.dataBorn = dataBorn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
