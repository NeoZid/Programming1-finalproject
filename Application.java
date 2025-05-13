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
    
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        Scanner scanner = new Scanner(System.in);
        athletes = new ArrayList<>();
        activities = new ArrayList<>();
        printWelcome();
    }
    
    public void printWelcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to StrongAF, an application that records your workout!");
        System.out.println("What would you like to do today?");
        System.out.println("Select from the following");
        System.out.println("SignUp");
        System.out.println("ListAthletes");
        System.out.println("ChooseActivity");
        switch (scanner.next()) {
            case "SignUp":
                athleteSignup();
                break;
            case "ListAthletes":
                listAllAthletes();
                break;
            case "ChooseActivity" :
                activityCreation();
                break;
        }
    }
    
    public void athleteSignup(){
        String name; 
        int age;
        double weight;
        Gender gender;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your weight: ");
        weight = sc.nextDouble();
        System.out.println("Enter your gender (MALE/FEMALE/OTHER):");
        switch (sc.next()) {
            case "MALE":
                gender = Gender.MALE;
                break;
            case "FEMALE":
                gender = Gender.FEMALE;
                break;
            case "OTHER":
                gender = Gender.OTHER;
                break;
        }
        // try {
            // gender = Gender.valueOf(sc.nextLine().toUpperCase());
        // } catch (IllegalArgumentException e) {
            // System.out.println("Invalid gender entered. Defaulting to OTHER.");
            // gender = Gender.OTHER;
        // }
        // String inputGender = sc.nextLine().toUpperCase();
        // gender = Gender.valueOf(gender);
        Athlete athleteInfo = new Athlete(name, age, weight); // add gender here when we know how to figure the Scanner out for ENUMS
        athletes.add(athleteInfo);
        activityCreation();
    }
    
    public void listAllAthletes(){
        System.out.println("Here's all of the athletes that signed up:");
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
        
         // if (athletes.isEmpty()) {
            // System.out.println("No athletes registered yet.");
        // } else {
            // System.out.println("\nRegistered Athletes:");
            // for (Athlete athlete : athletes) {
                // System.out.println("- " + athlete);
            // }
        // }
    }
    public void activityCreation(){
        
        
        // Activity activityList = new Activity(name, mode);
        // activities.add(activityList);    
         if (athletes.isEmpty()) {
            System.out.println("Please sign up an athlete first.");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating new activity...");
        System.out.println("Is it a powered activity or not?");
        System.out.println("yes/no");
        switch (scanner.next()) {
            case "yes":
                poweredActivity();
                break;
            case "no":
                standardActivity();
                break;
        }
        
        // we do this for all types we have " distance, minutes, athlete by number and etc..."
    }
    
    public void standardActivity(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select an activity and type it's corresponding number:");
        System.out.println("1. Running, 2. Walking, 3. Planks, 4. Push-Ups");
        switch (sc.next()) { 
            case "1":
                chooseRunning();
                break;
            case "2":
                chooseWalking();
                break;
            case "3":
                choosePlanks();
                break;
            case "4":
                choosePushUps();
                break;
        }
    }
    
    public static void chooseRunning(){
        double distance;
        double speed;
        int duration;
        double caloriesBurned;

        Scanner sc = new Scanner(System.in);
        System.out.println("How far did you run? ");
        distance = sc.nextDouble();
        System.out.println("How long did you run for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.print("Great progress! You have ran a total of " + distance + " km" + "\n");
        caloriesBurned = distance * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
    }
    
    public static void chooseWalking(){
        double distance;
        double speed;
        int duration;
        double caloriesBurned;

        Scanner sc = new Scanner(System.in);
        System.out.println("How far did you walk? ");
        distance = sc.nextDouble();
        System.out.println("How long did you walk for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.print("Great progress! You have ran a total of " + distance + " km" + "\n");
        caloriesBurned = distance * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
    }
    
    public static void choosePlanks(){
        int amount;
        int duration;
        double caloriesBurned;

        Scanner sc = new Scanner(System.in);
        System.out.println("How long did you do it for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.println("How many did you do?");
        amount = sc.nextInt();
        caloriesBurned = amount * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
    }
    
    public static void choosePushUps(){
        int amount;
        int duration;
        double caloriesBurned;

        Scanner sc = new Scanner(System.in);
        System.out.println("How long did you do it for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.println("How many did you do?");
        amount = sc.nextInt();
        caloriesBurned = amount * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
    }
    
    public void poweredActivity(){
        String name;
        //transportationMode mode;
        double distance;
        int duration; // minutes
        double caloriesBurned;
        Athlete athlete;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter activity name: ");
        name = sc.nextLine();
        //System.out.println("What is the mode of transport?");
        System.out.println("Available transportation modes:");
        for (transportationMode mode : transportationMode.values()) {
            System.out.println("- " + mode);
        }
        System.out.print("Enter distance (km): ");
        distance = sc.nextDouble();
        System.out.print("Enter duration (minutes): ");
        duration = sc.nextInt();
         System.out.print("Enter equipment used: ");
        String equipment = sc.nextLine();
        System.out.println("Choose an athlete by index:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println(i + ": " + athletes.get(i).getName());
        }
    }
    
    public void quit(){
        String name;
        if (scanner.equals("quit")) {
            scanner.close();
        }
    }
    // void activityCreation(String name, transportationMode mode){
        //Activity activityList = new Activity(name, mode);
        //activities.add(activityList);}    
    
     public void activityList()
    {
        System.out.println("Regular activies include:");
        for (int i =0; i < activities.size(); i++) {
            System.out.println(activities.get(i));
        }
    }
    
}
