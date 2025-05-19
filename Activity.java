import java.util.ArrayList;
import java.util.Scanner;
/**
 * Stores core information such as activity name, transportaion mode,
 * any equipment used, distance covered, duration, and calories burned.
 * 
 * Athors : Neo / Kimia / Floyd
 * version: (2025/05/18)
 */
public class Activity
{
    private String name;
    private transportationMode mode;
    private double distance; // in kilometers
    private int duration; // minutes
    private double caloriesBurned;
    private Athlete athlete;
    private String equipment;
    
     /**
     * Constructs a new Activity with the provided attributes.
     * 
     * @param name the name of the activity (e.g., Running, Walking)
     * @param mode the mode of transportation, if applicable (can be null for non-powered)
     * @param equipment the equipment used (can be null for bodyweight activities)
     * @param distance the distance covered in kilometers
     * @param duration the duration in minutes
     * @param caloriesBurned the estimated calories burned
     */
    public Activity(String name, transportationMode mode, String equipment, double distance, int duration, double caloriesBurned, Athlete athlete) {
        this.name = name;
        this.mode = mode;
        this.equipment = equipment;
        this.distance = distance;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.athlete = athlete;
    }
    
<<<<<<< HEAD
     /**
     * Returns a string representation of the activity, including its name,
     * mode, equipment, calories burned, and the associated athlete.
     * 
     * @return a formatted string summarizing the activity
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public String toString(){
        return "Name:" + name + 
               "\nMode:" + mode +
               "\nEquipmentUsed:" + equipment + 
               "\nCaloriesBurned:" + caloriesBurned + 
               "\nAthlete:" + athlete;
    }
<<<<<<< HEAD
    
     /**
     * Returns the name of the equipment used in the activity.
     * 
     * @return the equipment used
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public String getEquipment(){
        return equipment;
    }
    
     /**
     * Displays brief details about the activity.
     * (Implementation can be customized to show duration, distance, etc.)
     */
    public void activityDetail(){
        // prints brief details on the activites
        System.out.println(name + " for "+ duration + " mins, covering " + distance + " km.");
    }
    
     /**
     * Placeholder for logic to choose between regular and powered activity.
     * (Could involve prompting the user or making a selection based on input.)
     */
    public void chooseActivity(){
        // choose between Regular/Power activities
    }
    
     /**
     * Returns the name of the activity.
     * 
     * @return the activity name
     */
    public String getName() { 
        return name; 
    }
    
<<<<<<< HEAD
    
    /**
     * Returns the transportation mode used in the activity.
     * 
     * @return the transportation mode
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public transportationMode getMode() {
        return mode; 
    }
    
<<<<<<< HEAD
    
    /**
     * Returns the distance covered during the activity in kilometers.
     * 
     * @return the distance in km
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public double getDistance() { 
        return distance; 
    }
    
<<<<<<< HEAD
      /**
     * Returns the duration of the activity in minutes.
     * 
     * @return the duration in minutes
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public int getDuration() { 
        return duration; 
    }
    
<<<<<<< HEAD
     /**
     * Returns the athlete who performed the activity.
     * 
     * @return the associated Athlete object
     */
=======
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
    public Athlete getAthlete() { 
        return athlete;
    }
    
<<<<<<< HEAD
     /**
     * Returns the number of calories burned during the activity.
     * 
     * @return calories burned
     */
    public double getCaloriesBurned() {
=======
     public double getCaloriesBurned() {
>>>>>>> 23d7a59eb8251e0d0453c58d622d4e40d7c32a0a
        return caloriesBurned;
    }
}
