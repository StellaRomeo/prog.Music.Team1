package dh.team1;

import dh.Account.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user1 = new User("SalFox", "scalisi.salvo02@gmail.com", "Cavallo@123","Salvo","Scalisi","2002/09/20","male","Italy",0);
        Database db = new Database();

        db.insertUser(user1); //TODO: prima di aggiungere verificare username ed email se già esistono
    }
}