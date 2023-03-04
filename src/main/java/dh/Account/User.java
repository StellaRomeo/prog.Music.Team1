package dh.Account;

import dh.exception.AccountExceptions;
import lombok.Getter;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class User extends Account{

    String name;
    String surname;
    String dateOfBirth;
    String gender;
    String nationality;
    int isAdmin; //chiedere per il boolean su db

    public User(String username, String email, String password, String name, String surname, String dateOfBirth, String gender, String nationality, int isAdmin){
            super(username, email, password);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            this.creationDate = dtf.format(now);
            this.name = name;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.nationality = nationality;
            this.isAdmin = isAdmin;
            try{
                if(!isValidPassword(password)){
                    throw new AccountExceptions();
                }else{
                    this.password=password;
                }
                if(!isValidEmail(email)){
                    throw new AccountExceptions();
                }else{
                    this.email=email;
                }
            }catch(AccountExceptions e){
                System.out.println("Email o password non valida");
            }
    }

    private boolean isValidPassword(String password){
        //controlla se è lunghezza almeno 8
        if(password.length()<8){
            return false;
        }

        //controlla la presenza di un simbolo speciale
        if(!password.matches(".*[!@#$%^&*()].*")){
            return false;
        }

        //controlla la presenza di una lettera maiuscola
        if(!password.matches(".*[A-Z].*")){
            return false;
        }
        //controlla la presenza di un numero
        if(!password.matches(".*\\d.*")){
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email){
        // Controlla la sintassi dell'email
        if (!email.matches("\\b[\\w.%-]+@[\\w.-]+\\.[a-zA-Z]{2,}\\b")) {
            return false;
        }
        // Controlla la validità del dominio
        String[] parts = email.split("@");
        String domain = parts[1];
        try {
            InetAddress.getByName(domain);
        } catch (UnknownHostException ex) {
            return false;
        }
        // L'email è valida
        return true;
    }

    public String hashPassword(){
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(this.password,salt);
    }

    public boolean checkPassword(String password, String hashedPassword){
        return BCrypt.checkpw(password,hashedPassword);
    }
}
