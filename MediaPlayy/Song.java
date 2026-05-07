public class Song implements Media, Playable {

    private String title;
    private int duration;
    private String artist;
    private String genre;
    
    public Song(String title,String artist,String genre,int duration){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle(){return this.title;}
    public int getDuration(){return this.duration;}
    public String getArtist() { return this.artist; }
    public String getGenre() { return this.genre; }

    public void play(){
        System.out.println( "Now playing: " + this.title +" by " + this.artist);
    }

    @Override
    public String toString() {
        return "Song: Title=" + title + ", Artist=" + artist + ", Genre=" + genre + ", Duration=" + duration + " minutes";
    }
}
