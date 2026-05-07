import java.util.*;

public class FitnessSchedule {
    private Set<Schedule> classes;
    private Map<Member, Set<Schedule>> memberSchedule;

    public FitnessSchedule(){
        this.classes = new LinkedHashSet<>();
        this.memberSchedule = new LinkedHashMap<>();
    }

    public void addClass(Schedule schedule){
        classes.add(schedule);
    }

    public void enrollMember(Member member, Schedule schedule){
        if(!memberSchedule.containsKey(member)){
            memberSchedule.put(member, new LinkedHashSet<>());
        }
        memberSchedule.get(member).add(schedule);
        System.out.println(member.getName() + " enrolled in " + getClassName(schedule));
    }

    public void viewMemberSchedule(Member member){
        System.out.println(member.getName() + "'s Schedule:");
        Set<Schedule> schedules = memberSchedule.get(member);
        if(schedules != null){
            for(Schedule s :schedules){
                System.out.println(s.getDay() + " at " + s.getTime() + " (" + getClassName(s) + ")");
            }
        }
    }

    public void viewClassParticipants(Schedule schedule){
        System.out.println("Participants in " + getClassName(schedule) + ":");
        for(Map.Entry<Member, Set<Schedule>> entry : memberSchedule.entrySet()){
            if(entry.getValue().contains(schedule)){
                System.err.println(entry.getKey().getName());
            }
        }
    }

    private String getClassName(Schedule schedule) {
        if (schedule instanceof YogaClass)   return "Yoga Class";
        if (schedule instanceof ZumbaClass)  return "Zumba Class";
        if (schedule instanceof BoxingClass) return "Boxing Class";
        return "Unknown Class";
    }

    public static void main(String[] args) {
        // Task 4: Create objects
        YogaClass yoga     = new YogaClass("Alice", "9:00 AM", "Monday");
        ZumbaClass zumba   = new ZumbaClass("Bob",   "6:00 PM", "Tuesday");
        BoxingClass boxing = new BoxingClass("Cindy", "7:00 PM", "Wednesday");
 
        System.out.println("Creating Classes:");
        System.out.println(yoga);
        System.out.println(zumba);
        System.out.println(boxing);
 
        Member john = new Member("John", "123");
        Member jane = new Member("Jane", "456");
 
        System.out.println("\nCreating Members:");
        System.out.println(john);
        System.out.println(jane);
 
        FitnessSchedule fs = new FitnessSchedule();
        fs.addClass(yoga);
        fs.addClass(zumba);
        fs.addClass(boxing);
 
        System.out.println("\nEnrolling Members:");
        fs.enrollMember(john, yoga);
        fs.enrollMember(jane, zumba);
        fs.enrollMember(john, boxing);
 
        System.out.println();
        fs.viewMemberSchedule(john);
 
        System.out.println();
        fs.viewClassParticipants(yoga);
 
        System.out.println();
        fs.viewClassParticipants(zumba);
 
        System.out.println();
        fs.viewClassParticipants(boxing);
    }
}
