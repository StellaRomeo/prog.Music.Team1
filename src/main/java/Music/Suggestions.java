package Music;

import Account.Artist;

public class Suggestions {

    private Song[] listSongs;
    private Artist[] listArtist;
    private Album[] listAlbum;
    private Playlist[] listPlaylist;

    public Suggestions(Song[] listSongs,Artist[] listArtist,Album[] listAlbum,Playlist[] listPlaylist ){
        this.listSongs = listSongs;
        this.listArtist = listArtist;
        this.listAlbum = listAlbum;
        this.listPlaylist = listPlaylist;
    }
}
