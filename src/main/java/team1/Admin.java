package team1;
/**
 * @author Maria Coman
 */
public class Admin extends Person{

    protected String nickname;

    private Account account;

    /**

     * @param name        name of the admin
     * @param surname     surname of the admin
     * @param nationality nationality of the admin
     * @param birthDay    birthDay of the admin
     * @param mail        mail of the admin
     */
    public Admin( String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);

    }

    /**
     * this method generate account for admin
     * @param account account of the admin
     * @param nickname nickname of the admin
     */
    public void addAccount(Account account,Admin admin,String nickname){
        this.nickname=nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
