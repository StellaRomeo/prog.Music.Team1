    import team1.Admin;
    import team1.Artist;

    import team1.DataBase_manager_02;
    import team1.GenereTypeEnum;

    public class Main {
        public static void main(String[] args) {

            System.out.println("Hello world!");

            DataBase_manager_02.DB_Manager(args);


           Admin admin = new Admin("13444555", "345657678", "Pippo", "Marconi", "Russo", "12/97/233");
           System.out.println(admin);


           Artist artist=new Artist("Polino2","Valerio","Russo","12/45/1999","polino@gmail.it", GenereTypeEnum.Latina,"454342356");
           artist.addSong("Non lasciarmi mai",GenereTypeEnum.Heavy_Metal,"Federico Pacciani","Federicopacciani","Pippo","EMi-records","1999");
           artist.getArtistSongList().stream().forEach(song -> System.out.println(song.songDetails()));



        }
    }