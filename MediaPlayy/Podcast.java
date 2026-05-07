public class Podcast implements Media , Playable {

    private String title;
    private int duration;
    private String host;
    private String topic;

    public Podcast(String title,String host,String topic,int duration){
        this.title = title;
        this.host = host;
        this.topic = topic;
        this.duration = duration;
    }

    public String getTitle(){return this.title;}
    public int getDuration(){return this.duration;}
    public String getHost(){return this.host;}
    public String getTopic(){return this.topic;}

    public void play(){
        System.out.println( "Now playing: " + this.title +" by " + this.host);
    }

    @Override
    public String toString() {
        return "Podcast: Title=" + title + ", Host=" + host + ", Topic=" + topic + ", Duration=" + duration + " minutes";
    }

}
