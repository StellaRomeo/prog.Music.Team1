package team1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase_manager_02 {
    /**
     * @author Maria Coman
     */
public static void DB_Manager(String[]args){
    String DB_URL="jdbc:mysql://localhost:3306/prog_music";
    String  user="root";
    String  password="" +"";



    Connection connection= null;



        try {
        connection = DriverManager.getConnection(DB_URL, user, password);

        Statement statement = connection.createStatement();
        String varname2 = ""
                + "CREATE SCHEMA IF NOT EXISTS `prog_music` DEFAULT CHARACTER SET utf8 ;";
        statement.executeLargeUpdate(varname2);
        System.out.println("Schema creato correttamente");
        statement.close();
        statement = connection.createStatement();


    String varname1 = ""
            + "SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;";
            statement.executeLargeUpdate(varname1);

    String varname11 = ""
            + "SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;";
            statement.executeUpdate(varname11);

    String varname12 = ""
            + "SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Schema prog_music "
            + "-- ----------------------------------------------------- "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Schema prog_music "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname12);

    String varname13 = ""
            + "CREATE SCHEMA IF NOT EXISTS `prog_music` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ; "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname13);

    String varname14 = ""
            + "USE `prog_music` ; "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`DH_music` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname14);

    String varname15 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`DH_music` ( "
            + "  `idDH_music` INT NOT NULL, "
            + "  `name` VARCHAR(45) NOT NULL, "
            + "  `adress_mail` VARCHAR(45) NOT NULL, "
            + "  PRIMARY KEY (`idDH_music`), "
            + "  UNIQUE INDEX `idMC_Music_UNIQUE` (`idDH_music` ASC) VISIBLE) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`admin` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname15);

    String varname16 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`admin` ( "
            + "  `idadmin` INT NOT NULL, "
            + "  `Name` VARCHAR(50) NOT NULL, "
            + "  `Surname` VARCHAR(50) NOT NULL, "
            + "  `Nazionality` VARCHAR(45) NOT NULL, "
            + "  `birth_day` VARCHAR(45) NOT NULL, "
            + "  `mail` VARCHAR(45) NOT NULL, "
            + "  `password` VARCHAR(45) NOT NULL, "
            + "  `DH_music_idDH_music` INT NOT NULL, "
            + "  PRIMARY KEY (`idadmin`), "
            + "  UNIQUE INDEX `idadmin_UNIQUE` (`idadmin` ASC) VISIBLE, "
            + "  INDEX `fk_admin_DH_music1_idx` (`DH_music_idDH_music` ASC) VISIBLE, "
            + "  CONSTRAINT `fk_admin_DH_music1` "
            + "    FOREIGN KEY (`DH_music_idDH_music`) "
            + "    REFERENCES `prog_music`.`DH_music` (`idDH_music`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`album` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname16);

    String varname17 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`album` ( "
            + "  `idAlbum` INT NOT NULL, "
            + "  `nameOfAlbum` VARCHAR(45) NOT NULL, "
            + "  `dateOfCreation` VARCHAR(45) NOT NULL, "
            + "  PRIMARY KEY (`idAlbum`), "
            + "  UNIQUE INDEX `idAlbum_UNIQUE` (`idAlbum` ASC) VISIBLE) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`artist` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname17);

    String varname18 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`artist` ( "
            + "  `idArtist` INT NOT NULL AUTO_INCREMENT, "
            + "  `Name` VARCHAR(50) NOT NULL, "
            + "  `Surname` VARCHAR(50) NOT NULL, "
            + "  `Nazionality` VARCHAR(45) NOT NULL, "
            + "  `birth_day` VARCHAR(45) NOT NULL, "
            + "  `mail` VARCHAR(45) NOT NULL, "
            + "  `GenereMusic` VARCHAR(45) NOT NULL, "
            + "  `password` VARCHAR(45) NOT NULL, "
            + "  `DH_music_idDH_music` INT NOT NULL, "
            + "  PRIMARY KEY (`idArtist`), "
            + "  UNIQUE INDEX `idArtist_UNIQUE` (`idArtist` ASC) VISIBLE, "
            + "  INDEX `fk_artist_DH_music1_idx` (`DH_music_idDH_music` ASC) VISIBLE, "
            + "  CONSTRAINT `fk_artist_DH_music1` "
            + "    FOREIGN KEY (`DH_music_idDH_music`) "
            + "    REFERENCES `prog_music`.`DH_music` (`idDH_music`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION) "
            + "ENGINE = InnoDB "
            + "AUTO_INCREMENT = 2 "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`song` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname18);

    String varname19 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`song` ( "
            + "  `idSong` INT NOT NULL AUTO_INCREMENT, "
            + "  `title` VARCHAR(45) NOT NULL, "
            + "  `songGenre` VARCHAR(45) NOT NULL, "
            + "  `executor` VARCHAR(45) NOT NULL, "
            + "  `writer` VARCHAR(45) NOT NULL, "
            + "  `productor` VARCHAR(45) NOT NULL, "
            + "  `source` VARCHAR(45) NOT NULL, "
            + "  `dateOfCreation` VARCHAR(45) NOT NULL, "
            + "  `artist_idArtist` INT NOT NULL, "
            + "  PRIMARY KEY (`idSong`), "
            + "  UNIQUE INDEX `idSong_UNIQUE` (`idSong` ASC) VISIBLE, "
            + "  INDEX `fk_song_artist1_idx` (`artist_idArtist` ASC) VISIBLE, "
            + "  CONSTRAINT `fk_song_artist1` "
            + "    FOREIGN KEY (`artist_idArtist`) "
            + "    REFERENCES `prog_music`.`artist` (`idArtist`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION) "
            + "ENGINE = InnoDB "
            + "AUTO_INCREMENT = 5 "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`album_has_song` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname19);

    String varname110 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`album_has_song` ( "
            + "  `Album_idAlbum` INT NOT NULL, "
            + "  `Song_idSong` INT NOT NULL, "
            + "  PRIMARY KEY (`Album_idAlbum`, `Song_idSong`), "
            + "  INDEX `fk_Album_has_Song_Song1_idx` (`Song_idSong` ASC) VISIBLE, "
            + "  INDEX `fk_Album_has_Song_Album1_idx` (`Album_idAlbum` ASC) VISIBLE, "
            + "  CONSTRAINT `fk_Album_has_Song_Album1` "
            + "    FOREIGN KEY (`Album_idAlbum`) "
            + "    REFERENCES `prog_music`.`album` (`idAlbum`), "
            + "  CONSTRAINT `fk_Album_has_Song_Song1` "
            + "    FOREIGN KEY (`Song_idSong`) "
            + "    REFERENCES `prog_music`.`song` (`idSong`)) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`library` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname110);

    String varname111 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`library` ( "
            + "  `idLibrary` INT NOT NULL, "
            + "  `Playlist` INT NOT NULL, "
            + "  `Artist` VARCHAR(45) NOT NULL, "
            + "  `Album` VARCHAR(45) NOT NULL, "
            + "  `ListaPodCast` VARCHAR(45) NOT NULL, "
            + "  PRIMARY KEY (`idLibrary`), "
            + "  UNIQUE INDEX `idLibrary_UNIQUE` (`idLibrary` ASC) VISIBLE) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`Home` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname111);

    String varname112 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`Home` ( "
            + "  `idListe` INT NOT NULL, "
            + "  `Lista_User` VARCHAR(45) NULL, "
            + "  `Lista_Artisti` VARCHAR(45) NULL, "
            + "  `Lista_Song` VARCHAR(45) NULL, "
            + "  `Lista_Album` VARCHAR(45) NULL, "
            + "  PRIMARY KEY (`idListe`), "
            + "  UNIQUE INDEX `idListe_UNIQUE` (`idListe` ASC) VISIBLE) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci; "
            + " "
            + " "
            + "-- ----------------------------------------------------- "
            + "-- Table `prog_music`.`user` "
            + "-- -----------------------------------------------------";
            statement.executeUpdate(varname112);

    String varname113 = ""
            + "CREATE TABLE IF NOT EXISTS `prog_music`.`user` ( "
            + "  `idUser` INT NOT NULL AUTO_INCREMENT, "
            + "  `Name` VARCHAR(50) NOT NULL, "
            + "  `Surname` VARCHAR(50) NOT NULL, "
            + "  `Nazionality` VARCHAR(45) NOT NULL, "
            + "  `birth_day` VARCHAR(45) NOT NULL, "
            + "  `mail` VARCHAR(45) NOT NULL, "
            + "  `DH_music_idDH_music` INT NOT NULL, "
            + "  `library_idLibrary` INT NOT NULL, "
            + "  `Home_idListe` INT NOT NULL, "
            + "  PRIMARY KEY (`idUser`), "
            + "  UNIQUE INDEX `idUtente_UNIQUE` (`idUser` ASC) VISIBLE, "
            + "  INDEX `fk_user_DH_music1_idx` (`DH_music_idDH_music` ASC) VISIBLE, "
            + "  INDEX `fk_user_library1_idx` (`library_idLibrary` ASC) VISIBLE, "
            + "  INDEX `fk_user_Home1_idx` (`Home_idListe` ASC) VISIBLE, "
            + "  CONSTRAINT `fk_user_DH_music1` "
            + "    FOREIGN KEY (`DH_music_idDH_music`) "
            + "    REFERENCES `prog_music`.`DH_music` (`idDH_music`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION, "
            + "  CONSTRAINT `fk_user_library1` "
            + "    FOREIGN KEY (`library_idLibrary`) "
            + "    REFERENCES `prog_music`.`library` (`idLibrary`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION, "
            + "  CONSTRAINT `fk_user_Home1` "
            + "    FOREIGN KEY (`Home_idListe`) "
            + "    REFERENCES `prog_music`.`Home` (`idListe`) "
            + "    ON DELETE NO ACTION "
            + "    ON UPDATE NO ACTION) "
            + "ENGINE = InnoDB "
            + "DEFAULT CHARACTER SET = utf8mb4 "
            + "COLLATE = utf8mb4_0900_ai_ci;";
            statement.executeUpdate(varname113);

    String varname114 = ""
            + "SET SQL_MODE=@OLD_SQL_MODE;";

            statement.executeUpdate(varname114);
    String varname115 = ""
            + "SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;";
            statement.executeUpdate(varname115);

    String varname116 = ""
            + "SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS; ";
            statement.executeUpdate(varname116);

        statement.close();
        connection.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}



