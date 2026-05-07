public class ZumbaClass implements Schedule{
    private String trainer;
    private String time;
    private String day;

    public ZumbaClass(String trainer,String time,String day){
        this.trainer = trainer;
        this.time = time;
        this.day = day;
    }
    public String getTime(){return this.time;}
    public String getDay(){return this.day;}
    public String getTrainer(){return this.trainer;}

    @Override
    public String toString() {
        return "Zumba Class: " + day + " at " + time + " with Instructor: " + trainer;
    }
 
    public String getClassName() { return "Zumba Class"; }
}
