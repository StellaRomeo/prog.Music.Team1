package Account;

import Music.Playlist;
import java.util.Date;
import java.util.List;


public class User extends Account {

    private String name;
    private String surname;
    private Date dataBorn;
    private String gender;
    private String nationality;
    private String address;
    private String city;
    private String country;


    public User(String username, String password, String email, boolean isPlaying,boolean isStopping,boolean isSkipping,
                boolean isPausing,boolean isRepeating ) {
        super(username, password, email);
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

    public Date getDataBorn() {
        return dataBorn;
    }

    public void setDataBorn(Date dataBorn) {
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

    @Override
    public List<Playlist> getPlaylists() {
        return super.getPlaylists();
    }

    @Override
    public void createAccount() {
        super.createAccount();
    }

    @Override
    public void deleteAccount() {
        super.deleteAccount();
    }

    @Override
    public void updateAccount() {
        super.updateAccount();
    }

}
