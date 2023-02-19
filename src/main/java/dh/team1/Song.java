package dh.team1;

public class Song  {
    //private Integer id;
    private String title;
    private Song GenreTypeEnum;

    private String executor;
    private String writer;
    private String productor;
    private String source;
    private String error;
    private boolean like;

    public Song(boolean like) {
        this.like = like;
    }

    public Song(String title, Song genreTypeEnum, String executor,
                String writer, String productor,
                String source, String error) {
        this.title = title;
        GenreTypeEnum = genreTypeEnum;
        this.executor = executor;
        this.writer = writer;
        this.productor = productor;
        this.source = source;
        this.error = error;
    }



    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song getGenreTypeEnum() {
        return GenreTypeEnum;
    }

    public void setGenreTypeEnum(Song genreTypeEnum) {
        GenreTypeEnum = genreTypeEnum;
    }



    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
