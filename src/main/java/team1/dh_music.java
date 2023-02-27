    package team1;

    import java.util.ArrayList;
    import java.util.List;

    public class dh_music {
        private List<Artist> artistList=new ArrayList<>();

        public void addArtist(Artist artist){
            artistList.add(artist);
        }


    }
   /*DataBase_manager.DB_Manager(args);

           Admin admin = new Admin("13444555", "345657678", "Pippo", "Marconi", "Russo", "12/97/233");
           System.out.println(admin);


           Artist artist=new Artist("Polino2","Valerio","Russo","12/45/1999","polino@gmail.it", GenereTypeEnum.Latina,"454342356");
           artist.addSong("Non lasciarmi mai",GenereTypeEnum.Heavy_Metal,"Federico Pacciani","Federicopacciani","Pippo","EMi-records","1999");
           artist.getArtistSongList().stream().forEach(song -> System.out.println(song.songDetails()));
           */