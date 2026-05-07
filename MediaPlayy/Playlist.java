import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public List<Media> mediaList;

    public Playlist(){
        this.mediaList = new ArrayList<>();
    }

    public void addMedia(Media media){
        mediaList.add(media);
    }

    public int getTotalDuration(){
        int total=0;
        for(Media m : mediaList){
            total += m.getDuration();
        }
        return total;
    }

    public void playAll(){
        for(Media m : mediaList){
            if(m instanceof Playable){
                ((Playable) m).play();
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Creating Media...");
        Song song = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
        Movie movie = new Movie("Inception", "Christopher Nolan", 8.8, 148);
        Podcast podcast = new Podcast("The Daily", "Michael Barbaro", "News", 20);
 
        System.out.println(song);
        System.out.println(movie);
        System.out.println(podcast);
 
        System.out.println("\nAdding Media to Playlist...");
        Playlist playlist = new Playlist();
        playlist.addMedia(song);
        playlist.addMedia(movie);
        playlist.addMedia(podcast);
 
        System.out.println("Total Playlist Duration: " + playlist.getTotalDuration() + " minutes");
 
        System.out.println("\nPlaying Playlist:");
        playlist.playAll();
    }
}

