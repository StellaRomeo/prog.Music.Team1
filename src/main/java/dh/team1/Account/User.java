package dh.team1.Account;

import java.util.Date;

public class User extends Account{

    String name;
    String surname;
    Date dateOfBirth;
    String gender;


    public String setName(){
      return this.name=  scanner.nextLine();
    }

    public String setSurname(){
        return this.surname=  scanner.nextLine();
    }

    //TODO
    public Date setDateOfBirth(){
        return this.dateOfBirth;
    }


    //TODO

    public void setGender(){
        enum GENDERS{
            MALE,
            FAMALE,
            NONBINARY,

        }
      this.gender= String.valueOf(GENDERS.values());
    }

}
