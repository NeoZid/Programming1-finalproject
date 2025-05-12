
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity
{
    private String equipment;
    
     public PoweredActivity(String name, transportationMode mode, double distance, int duration, Athlete athlete, String equipment) {
        super(name, mode, distance, duration, athlete);
        this.equipment = equipment;
    }
    
    public String getEquipment() {
        return equipment; 
    }
}
