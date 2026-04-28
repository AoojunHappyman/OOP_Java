package stdIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class stdManager {
    public static void main(String[] args) {
        Students[] std ={
            new Students("Aoo", 80),
            new Students("Joe", 75),
            new Students("Mark", 60)
        };

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("std.txt"))){
            for(Students s : std){
                writer.write(s.getName() + " : " + s.getScore());
                writer.newLine();
            }    
    }catch(IOException e){
        e.printStackTrace();
    }
}
}