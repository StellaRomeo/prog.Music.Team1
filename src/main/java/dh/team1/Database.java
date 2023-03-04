package dh.team1;

import dh.Account.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String host = "jdbc:mysql://localhost:3306/dhdatabase";
    private static final String user = "developer";
    private static final String password = "developer";

    Connection connection;

    public Database() {
        System.out.println("Connecting to " + host + "...");
        try {
            connection = DriverManager.getConnection(host, user, password);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed :(");
            System.out.println(e.getMessage());
        }
    }
    public void insertUser(User user) throws SQLException {
        String query = String.format("insert into user (username, email, password, verificateEmail, creationDate, name, surname, dateOfBirth, gender, nationality, isAdmin) " +
                        "values (\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");"
                        , user.getUsername(), user.getEmail(),user.hashPassword(),"0",user.getCreationDate().toString()
                        , user.getName(),user.getSurname(),user.getDateOfBirth(),user.getGender(),user.getNationality(),user.getIsAdmin());
        connection.createStatement().executeUpdate(query);
        System.out.printf("Added %s %s to table user\n", user.getName(),user.getSurname());
    }
}
