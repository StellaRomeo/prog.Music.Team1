    package team1;

    import java.util.Collection;

    /**
     * @author Maria Coman
     */
    public class Song  {
        //private Integer id;
        private String title;
        private GenereTypeEnum songGenre;

        private String executor;
        private String writer;
        private String productor;
        private String source;
        private String error;
        private boolean like;
        private String dateOfCreation;

        public Song(String title, GenereTypeEnum songGenre, String executor,
                    String writer, String productor,
                    String source,String dateOfCreation) {
            this.title = title;
            this.songGenre = songGenre;
            this.executor = executor;
            this.writer = writer;
            this.productor = productor;
            this.source = source;
            this.dateOfCreation=dateOfCreation;
            ;
        }

        public  Song(String title, GenereTypeEnum songGenre,
                    String writer, String productor,String dateOfCreation) {
            this.title = title;
            this.songGenre = songGenre;
            this.writer = writer;
            this.productor = productor;
            this.dateOfCreation=dateOfCreation;

        }
        public  Song(){};



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


    public GenereTypeEnum getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(GenereTypeEnum songGenre) {
        this.songGenre = songGenre;
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

        /**
         *
         * @return the song details
         */
        public String songDetails() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", songGenre=" + songGenre +
                    ", executor='" + executor + '\'' +
                    ", writer='" + writer + '\'' +
                    ", productor='" + productor + '\'' +
                    ", source='" + source + '\'' +
                    ", dateOfCreation='" + dateOfCreation + '\'' +
                    '}';
        }


    }
