import java.util.ArrayList;

/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    // instance variables - replace the example below with your own
    private String name;
    private transportationMode mode;
    private ArrayList<PoweredActivity> poweredActivity;
    private ArrayList<RegularActivity> regularActivity;

     /**
     * Constructor for objects of class Activity
     */
    public Activity(String name, transportationMode mode)
    {
        this.name= name;
        this.mode = mode;
        this.poweredActivity = new ArrayList<>();
        this.regularActivity = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
}
