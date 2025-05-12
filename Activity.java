import java.util.ArrayList;

/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    private String name;
    private transportationMode mode;
    private double distance;
    private int duration; // minutes
    private Athlete athlete;
    // private ArrayList<String> poweredActivity;
    // private ArrayList<String> regularActivity;

     /**
     * Constructor for objects of class Activity
     */
    public Activity(String name, transportationMode mode, double distance, int duration, Athlete athlete) {
        this.name = name;
        this.mode = mode;
        this.distance = distance;
        this.duration = duration;
        this.athlete = athlete;
    }
    
    public void activityDetail(){
        // prints brief details on the activites
    }
    
    public void chooseActivity(){
        // choose between Regular/Power activities
    }
    
    public String getName() { 
        return name; 
    }
    public transportationMode getMode() {
        return mode; 
    }
    public double getDistance() { 
        return distance; 
    }
    public int getDuration() { 
        return duration; 
    }
    public Athlete getAthlete() { 
        return athlete;
    }
    
}
