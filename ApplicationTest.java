

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ApplicationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ApplicationTest
{
    /**
     * Default constructor for test class ApplicationTest
     */
    public ApplicationTest()
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
    
    @Test
    public void AthleteSignUp()
    {
        Application applicat1 = new Application();
    }
    @Test
    public void AthleteLogin()
    {
        Application applicat1 = new Application();
        applicat1.athleteSignup();
    }
    
    @Test
    public void TryingHard()
    {
        Application applicat1 = new Application();
        applicat1.listAllAthletes();
    }
}




