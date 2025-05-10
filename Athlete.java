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
    

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String name, int age, double weight /*Gender gender*/)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender; 
    }
    
    public String toString(){
         return name;
    }
    
    
}
