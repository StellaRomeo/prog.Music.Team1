package dh.team1;

import javax.xml.crypto.Data;

public class User {

    private String name;
    private String surname;
    private String email;
    private String address;
    private String city;
    private String country;
    private Data birthData;
    private String gender;

    public User (String name, String surname, String email, String address, String city, String country,Data birthData,String gender){
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setAddress(address);
        this.setCity(city);
        this.setCountry(country);
        this.setBirthData(birthData);
        this.setGender(gender);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Data getBirthData() {
        return birthData;
    }

    public void setBirthData(Data birthData) {
        this.birthData = birthData;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
