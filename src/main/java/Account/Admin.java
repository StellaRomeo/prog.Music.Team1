package Account;

public class Admin extends Account {

    private User user;


    public Admin(String username, String password, String email, boolean isPlaying,boolean isStopping,boolean isSkipping,
                 boolean isPausing,boolean isRepeating) {
        super(username, password, email, isPlaying,isStopping,isSkipping,isPausing,isRepeating );

    }

    public void setUserName(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
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
