public class YogaClass implements Schedule{

    private String trainer;
    private String time;
    private String day;

    public YogaClass(String trainer,String time,String day){
        this.trainer = trainer;
        this.time = time;
        this.day = day;
    }
    public String getTime(){return this.time;}
    public String getDay(){return this.day;}
    public String getTrainer(){return this.trainer;}

    @Override
    public String toString() {
        return "Yoga Class: " + day + " at " + time + " with Instructor: " + trainer;
    }
 
    public String getClassName() { return "Yoga Class"; }
}
