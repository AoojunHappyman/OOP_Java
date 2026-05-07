public class Movie implements Media , Playable{

    private String title;
    private int duration;
    private String director;
    private double rating;
    
    public Movie(String title,String director,double rating,int duration){
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.duration = duration;
    }

    public String getTitle(){return this.title;}
    public int getDuration(){return this.duration;}
    public String getDirector(){return this.director;}
    public double getRating(){return this.rating; }

    public void play(){
        System.out.println( "Now playing: " + this.title +" by " + this.director);
    }

    @Override
    public String toString() {
        return "Movie: Title=" + title + ", Director=" + director + ", Rating=" + rating + ", Duration=" + duration + " minutes";}
}
