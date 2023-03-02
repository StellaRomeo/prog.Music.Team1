package dh.team1.Account;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public abstract  class Account {

    String id;
    String username;
    String password;
    String email;
    Date creationDate;
    boolean loggedIn;
    String proPic;  //Immagine di profilo
    boolean verificateEmail;
    String codeVerificate;

    Scanner scanner = new Scanner(System.in);


    /*public String setUsername() {
        return this.username = scanner.nextLine();
    }

    // TODO: 14/02/2023  check if the password has the necessary criteria
    public String setPassword() {
        String pw = String.valueOf(scanner);
        if (pw.length() == 10) {
            return this.password = scanner.nextLine();
        } else {
            System.out.println("error");
        }


        // TODO: 14/02/2023  check if the email has the necessary criteria
       public void setEmail () {
            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder sb = new StringBuilder(6);
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                sb.append(characters.charAt(random.nextInt(characters.length())));
            }
            String code = sb.toString();

            this.email = scanner.nextLine();
            this.verificateEmail = false;//ciao


            this.codeVerificate = code;
            //send email with code.

        }

        public void verificateEmail () {
            String code = scanner.nextLine();
            if (code.equals(codeVerificate)) {
                this.verificateEmail = true;
                System.out.println("The email is \"Verificate\"");
            } else {
                System.out.println("The code is not correct");
            }

        }

        // TODO: 14/02/2023
        public String setProPic () {
            return this.proPic = scanner.nextLine();
        }


    }*/
}