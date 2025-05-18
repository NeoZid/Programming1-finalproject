import java.util.ArrayList;
import java.util.Scanner;
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
    private double caloriesBurned;
    private Athlete athlete;
    private String equipment;
    
     /**
     * Constructor for objects of class Activity
     */
    public Activity(String name, transportationMode mode, String equipment, double distance, int duration, double caloriesBurned/* Athlete athlete*/ ) {
        this.name = name;
        this.mode = mode;
        this.equipment = equipment;
        this.distance = distance;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.athlete = athlete;
        
    }
    
    public String toString(){
        return "Name:" + name + "\nMode:" + mode +"\nEquipmentUsed:" + equipment + "\nCaloriesBurned:" + caloriesBurned + "\nAthlete:" + athlete;
    }
    
    public String getEquipment(){
        return equipment;
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
     public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
