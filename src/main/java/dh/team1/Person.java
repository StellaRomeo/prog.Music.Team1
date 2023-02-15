package dh.team1;

public abstract class Person {
     private String name;
     private String surname;
    private String nationality;
     private  String birthDay ;

     private String mail;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", mail='" + mail + '\'' +
                '}';
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Person(String name, String surname, String nationality, String birthDay, String mail) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.birthDay = birthDay;
        this.mail = mail;
    }
}
