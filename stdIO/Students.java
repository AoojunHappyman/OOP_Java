package stdIO;

public class Students {
    public String name;
    public double score;

    public Students(String name ,double score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }
    public double getScore(){
        return this.score;
    }
}
