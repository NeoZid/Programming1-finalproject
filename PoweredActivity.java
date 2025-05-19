import java.util.ArrayList;

/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity
{
    private String equipment;
    
     public PoweredActivity(String name, transportationMode mode, String equipment, double distance, int duration, double caloriesBurned ,Athlete athlete) {
        super(name, mode, equipment, distance, duration, caloriesBurned/* athlete*/);
        
    }
    
}
