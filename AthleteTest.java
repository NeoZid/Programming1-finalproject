

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AthleteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AthleteTest
{
    /**
     * Default constructor for test class AthleteTest
     */
    public AthleteTest()
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
     * Test that an athlete is correctly created (name, age, weight and gender).
     */
    @Test
    public void testAthleteCreation()
    {
        Athlete athlete = new Athlete("test name", 20, 100, Gender.MALE);
        assertEquals("test name", athlete.getName());
        assertEquals(20, athlete.getAge());
        assertEquals(100, athlete.getWeight());
        assertEquals(Gender.MALE, athlete.getGender());
    }

    @Test
    public void TestAll()
    {
        //ApplicationMain.main({ });
    }
    

    @Test
    public void TryApp()
    {
        ApplicationMain applicat1 = new ApplicationMain();
    }

    @Test
    public void TRYING()
    {
        Athlete athlete1 = new Athlete("Kimia", 20, 20, Gender.FEMALE);
        assertEquals(20, athlete1.getAge());
        assertEquals(26, athlete1.getAge());
        //assertEquals(FEMALE, athlete1.getGender());
        //assertEquals(KIM, athlete1.getName());
        assertEquals(20, athlete1.getWeight(), 0.1);
        assertEquals(30, athlete1.getWeight(), 0.1);
        athlete1.setGender(Gender.MALE);
        //assertEquals(FEMALE, athlete1.getGender());
    }
}



