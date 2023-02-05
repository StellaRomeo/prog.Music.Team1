package Account;

public class Admin extends Account {

    private User user;
    private boolean isAdmin;
    private boolean isModerator;


    public Admin(String username, String password, String email, boolean isPlaying,boolean isStopping,boolean isSkipping,
                 boolean isPausing,boolean isRepeating,User user, boolean isAdmin,boolean isModerator) {
        super(username, password, email);
        this.user = user;
        this.isAdmin = true;
        this.isModerator = false;


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

    public void banUser(User user){
        //inserire codice
    }
    public void unbanUser(User user){
        //inserire codice
    }
}
