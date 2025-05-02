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
    private ArrayList<Athlete> athletes = new ArrayList<>();
    

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String name, int age, double weight, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender; 
        //athletes = new ArrayList<>();
    }
    
    public String toString(){
         return name;
    }
    
    
    // public void athleteSignup(String name, int age, double weight, Gender gender){
        // this.name = name;
        // this.age = age;
        // this.weight = weight;
        // this.gender = gender;
        
        
    // }
    
    
    public void activityList()
    {
        System.out.println("Regular activies include:");
    }
    
    
}
