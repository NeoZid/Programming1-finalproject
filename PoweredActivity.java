import java.util.ArrayList;

/**
 * PoweredActivity class represents a type of physical activity that uses equipment
 * (biking, rollerskating, skiing). It extends the base ACtivity class by
 * associationg an athlete with the activity and specifying the equipment used.
 * 
 * Athors : Neo / Kimia / Floyd
 * version: (2025/05/18)
 */
public class PoweredActivity extends Activity
{
    private String equipment;

    /**
     * Constructs a PoweredActivity object with the specified attributes.
     * Inherits from the Activity class and initializes all relevant fields.
     *
     * @param name the name of the activity (e.g., Biking)
     * @param mode the transportation mode used (e.g., BIKING, SKIING)
     * @param equipment the equipment used for the activity
     * @param distance the distance covered in kilometers
     * @param duration the duration of the activity in minutes
     * @param caloriesBurned the calories burned during the activity
     * @param athlete the athlete performing the activity
     */
    public PoweredActivity(String name, transportationMode mode, String equipment, double distance, int duration, double caloriesBurned ,Athlete athlete) {
        super(name, mode, equipment, distance, duration, caloriesBurned, athlete);
  
    }
}
