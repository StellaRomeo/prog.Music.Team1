package dh.team1;

public class Admin extends User{

    private  int id;
    private  String username;
    private  String password;


    public Admin(int id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
