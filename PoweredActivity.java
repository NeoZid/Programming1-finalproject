
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity
{
    // instance variables - replace the example below with your own
    private Equipment equipment;
    
    /**
     * Constructor for objects of class PoweredActivity
     */
    public PoweredActivity(String name, Mode mode, Equipment equipment)
    {
        // initialise instance variables
        super(name, mode);
        this.equipment = equipment;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
