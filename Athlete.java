import java.util.ArrayList;

/**
 * Write a description of class Athlete here.
 *
 * @author Neo / Kimia
 * @version 04-29-2025
 */
public class Athlete
{
    private String name;
    private Gender gender;
    private int age;
    private double weight;
    private ArrayList<Activity> activities;
    private ArrayList<String> athletes;
    

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete()
    {
        
        // this.athletes = new ArrayList<>();
        // this.activities = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    
    public void listAllAthletes(){
        
        System.out.println(athletes);
    }
    
    public void activityList()
    {
        System.out.println("Regular activies include:");
    }
    
    
}
