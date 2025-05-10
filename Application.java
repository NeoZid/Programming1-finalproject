import java.util.ArrayList;
import java.util.Scanner;
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
    private ArrayList<Activity> activities;
    private Scanner scanner;
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        Scanner scanner = new Scanner(System.in);
        athletes = new ArrayList<>();
        
        printWelcome();
    }
    
    public void printWelcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to StrongAF, an application that records your workout!");
        System.out.println("What would you like to do today?");
        System.out.println("Select from the following:");
        System.out.println("SignUp");
        System.out.println("ListAthletes");
        switch (scanner.next()) {
            case "SignUp":
                System.out.println("test");
                break;
            case "ListAthletes":
                listAllAthletes();
                break;
        }
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
    public void activityCreation(String name, transportationMode mode, PoweredActivity poweredActivity){
        Activity activityList = new Activity(name, mode);
        activities.add(activityList);    
    }
    
     public void activityList()
    {
        System.out.println("Regular activies include:");
        
        for (int i =0; i < activities.size(); i++) {
            System.out.println(activities.get(i));
        }
    }
    
}
