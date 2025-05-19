

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivityTest
{
    /**
     * Default constructor for test class ActivityTest
     */
    public ActivityTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * Test that an activity is correctly created (name, age, weight and gender).
     */
    @Test
    public void testActivityCreation()
    {
        Activity activity = new Activity("Rollerskating", transportationMode.ROLLERSKATES, "Rollerskates", 200, 20, 75, null);
        assertEquals("Rollerskating", activity.getName());
        assertEquals(transportationMode.ROLLERSKATES, activity.getMode());
        assertEquals("Rollerskates", activity.getEquipment());
        assertEquals(200, activity.getDistance());
        assertEquals(20, activity.getDuration());
        assertEquals(75, activity.getCaloriesBurned());
        assertEquals(null, activity.getAthlete());
    }
}
