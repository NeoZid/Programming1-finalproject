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
    private static ArrayList<Athlete> athletes;
    private ArrayList<Activity> activities;
    private Scanner scanner;
    private Gender gender;
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
        System.out.println("Select from the following");
        System.out.println("SignUp");
        System.out.println("ListAthletes");
        switch (scanner.next()) {
            case "SignUp":
                athleteSignup();
                break;
            case "ListAthletes":
                listAllAthletes();
                break;
        }
    }
    
    public void athleteSignup(){
        String name; 
        int age;
        double weight;
        Gender gender;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("How old are you?");
        age = sc.nextInt();
        System.out.println("How much do you weigh?");
        weight = sc.nextDouble();
        // System.out.println("What is your gender?");
        // String inputGender = sc.nextLine().toUpperCase();
        // gender = Gender.valueOf(gender);
        Athlete athleteInfo = new Athlete(name, age, weight); // add gender here when we know how to figure the Scanner out for ENUMS
        athletes.add(athleteInfo);
    }
    
    public void listAllAthletes(){
        System.out.println("Here's all of the athletes that signed up:");
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }
    public void activityCreation(String name, transportationMode mode, PoweredActivity poweredActivity){
        Activity activityList = new Activity(name, mode);
        activities.add(activityList);    
    }
    

    public void quit(){
        String name;
        if (scanner.equals("quit")) {
            scanner.close();
        }
    }
    public void activityCreation(String name, transportationMode mode){
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
