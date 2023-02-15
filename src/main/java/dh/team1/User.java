package dh.team1;

public class User extends Person{


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int Id;


    public User(int Id,String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);
        this.Id=Id;
    }
}
