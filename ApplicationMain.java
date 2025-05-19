
/**
 *The main controller class for the strongAF
 *
 * Athors : Neo / Kimia / Floyd
 * version: (2025/05/18)
 */
public class ApplicationMain
{
     /**
     * The main method is the entry point of the program.
     * It creates an instance of the Application class and initiates the application by
     * calling the printWelcome() method to display a welcome message or menu.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args)
    {
        Application application = new Application();
        application.printWelcome();
    }
}

