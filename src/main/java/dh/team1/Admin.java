package dh.team1;

public class Admin extends Person{


    private int Id;
    private String password;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }




    public Admin(int Id,String password,String name, String surname, String nationality, String birthDay, String mail) {
        super(name, surname, nationality, birthDay, mail);
        this.Id=Id;
        this.password=password;
    }
}
