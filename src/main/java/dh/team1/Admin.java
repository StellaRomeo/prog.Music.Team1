package dh.team1;

public class Admin extends Account{

    private User user;


    public Admin(int id, String username, String password, String email, User user) {
        super(id, username, password, email);
        this.user = user;

    }
}
