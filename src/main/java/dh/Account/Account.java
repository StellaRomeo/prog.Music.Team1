package dh.Account;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
@Getter
@Setter
public abstract class Account {

    String id;
    String username;
    String password;
    String email;
    String creationDate;

    boolean loggedIn; //verificare se utile o meno
    boolean verificateEmail;
    String codeVerificate;

    Scanner scanner= new Scanner(System.in);

    public Account(String username, String email,String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }
    public String setUsername(){
      return  this.username= scanner.nextLine();
    }

    // TODO: 14/02/2023  check if the password has the necessary criteria
    public String setPassword(){
       return this.password= scanner.nextLine();
    }

    // TODO: 14/02/2023  check if the email has the necessary criteria
    public void setEmail(){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(6);
        Random random= new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        String code= sb.toString();

        this.email= scanner.nextLine();
        this.verificateEmail= false;
        this.codeVerificate= code;
        //send email with code.
    }


    public void verificateEmail(){
        String code= scanner.nextLine();
        if (code.equals(codeVerificate)){
            this.verificateEmail= true;
            System.out.println("The email is \"Verificate\"");
        } else {
            System.out.println("The code is not correct");
        }

    }
    



}
