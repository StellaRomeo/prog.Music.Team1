package team1;

import java.util.Random;
/**
 * @author Maria Coman
 */
public class Account {
    private String id;
    public String password;
    public String personName;

    /**
     * This method generate id for the booking
     * @return id for the booking
     */

    public String generateID(){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    char[]id=new char[7];
        Random random=new Random();
        int index;
        for (int i=0;i<7;i++){
           index =random.nextInt(s.length());
           id[i]=s.charAt(index);
        }
        return  String.copyValueOf(id);

    }

    /**
     *
     * @param id
     * @param password  of the persoName
     * @param personName
     */

    public Account(String id, String password, String personName) {
        this.id = generateID();
        this.password = password;
        this.personName = personName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     *
     * @return  detailAccount
     */

    public String detailAccount() {
        return "Account{" +
                "id='" + id + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }

}
