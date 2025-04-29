
/**
 * Write a description of class Application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Application
{
    private String name;
    private Gender gender;
    private int age;
    private double weight;
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        
    }
    
    public void athleteSignup(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
