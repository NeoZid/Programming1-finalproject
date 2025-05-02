import java.util.ArrayList;

/**
 * Write a description of class Application here.
 *
 * Neo / Kimia
 * @version (a version number or a date)
 */
public class Application
{
    private String name;
    private Gender gender;
    private int age;
    private double weight;
    private static ArrayList<Athlete> athletes;
    
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        athletes = new ArrayList<>();
    }
    
    public void athleteSignup(String name, int age, double weight, Gender gender){
        Athlete athletesList = new Athlete(name, age, weight, gender);
        athletes.add(athletesList);    
    }
    
    
    
    public void listAllAthletes(){
        System.out.println("Here's all of the athletes that signed up:");

        for (int i =0; i < athletes.size(); i++) {
            System.out.println(athletes.get(i));
        }
        
        
    }
    
    
}
