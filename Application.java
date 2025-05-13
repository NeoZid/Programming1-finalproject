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
    private static ArrayList<Activity> activities;
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
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to StrongAF, an application that records your workout!");
        System.out.println("What would you like to do today?");
        System.out.println("Select from the following");
        System.out.println("1 - SignUp");
        System.out.println("2 - ListAthletes");
        System.out.println("3 - ListActivityHistory");
        System.out.println("Type 'quit' to exit");
        switch (scanner.next()) {
            case "1":
                athleteSignup();
                break;
            case "2":
                listAllAthletes();
                break;
            case "3" :
                listAllActivitiesDone();
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
        gender = null;
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
        Athlete athleteInfo = new Athlete(name, age, weight, gender); 
        athletes.add(athleteInfo);
        activityCreation();
    }
    
    public void listAllAthletes(){
        if (athletes.isEmpty()) {
            System.out.println("No athletes registered yet.");
        } else {
            System.out.println("\nRegistered Athletes:");
            for (Athlete athlete : athletes) {
                System.out.println("- " + athlete.getName());
            }
        }
        printWelcome();
    }
    public void activityCreation(){
        // Activity activityList = new Activity(name, mode);
        // activities.add(activityList);
         if (athletes.isEmpty()) {
            System.out.println("Please sign up an athlete first.");
            printWelcome();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating new activity...");
        System.out.println("What type of activity will you be doing?");
        System.out.println("Type 1 for Regular");
        System.out.println("Type 2 for Powered");
        // System.out.println("Type 3 for WithEquipment");
        switch (scanner.next()) {
            case "1":
                standardActivity();
                break;
            case "2":
                poweredActivity();
                break;
            // case "3" : 
                // PoweredActivity.chooseEquipmentActivity();
                // break;
        }

        printWelcome();
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
        String name;
        transportationMode mode;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How far did you run? ");
        distance = sc.nextDouble();
        System.out.println("How long did you run for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.print("Great progress! You have ran a total of " + distance + " km" + "\n");
        caloriesBurned = distance * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
        name = "Running";
        mode = null;
        Activity running = new Activity (name, mode, distance, duration, caloriesBurned /*athlete*/);
        activities.add(running);
    }
    
    public static void chooseWalking(){
        double distance;
        double speed;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;

        Scanner sc = new Scanner(System.in);
        System.out.println("How far did you walk? ");
        distance = sc.nextDouble();
        System.out.println("How long did you walk for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.print("Great progress! You have ran a total of " + distance + " km" + "\n");
        caloriesBurned = distance * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
        name = "Walking";
        mode = null;
        Activity walking = new Activity (name, mode, distance, duration, caloriesBurned /*athlete*/);
        activities.add(walking);
    }
    
    public static void choosePlanks(){
        int amount;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        double distance;

        Scanner sc = new Scanner(System.in);
        System.out.println("How long did you do it for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.println("How many did you do?");
        amount = sc.nextInt();
        caloriesBurned = amount * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
        name = "Planks";
        mode = null;
        distance = 0;
        Activity planks = new Activity (name, mode, distance, duration, caloriesBurned /*athlete*/);
        activities.add(planks);
    }
    
    public static void choosePushUps(){
        int amount;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        double distance;

        Scanner sc = new Scanner(System.in);
        System.out.println("How long did you do it for? (enter in minutes) ");
        duration = sc.nextInt();
        System.out.println("How many did you do?");
        amount = sc.nextInt();
        caloriesBurned = amount * duration;
        System.out.print("You have burned this amount of calories: " + caloriesBurned);
        name = "PushUps";
        mode = null;
        distance = 0;
        Activity pushUps = new Activity (name, mode, distance, duration, caloriesBurned /*athlete*/);
        activities.add(pushUps);
    }
    
    public void poweredActivity(){
        String name;
        transportationMode mode;
        double distance;
        double calories;
        int duration; // minutes
        double caloriesBurned;
        Athlete athlete;
        int athleteIndex;
        PoweredActivity activity;
        String equipment;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter activity name: ");
        System.out.println("Type 1,2,3,4");

        //System.out.println("What is the mode of transport?");
        System.out.println("Available transportation modes:");
        for (transportationMode modeList : transportationMode.values()) {
            System.out.println("- " + modeList);
        }
        mode = null;
        name = null;
          switch (sc.next()) {
            case "1":
                mode = transportationMode.BIKING;
                name = "BIKING";
                break;
            case "2":
                mode = transportationMode.ROLLERSKATES;
                name = "ROLLERSKATES";
                break;
            case "3" :
                mode = transportationMode.SWIMMING;
                name = "SWIMMING";
                break;
            case "4" :
                mode = transportationMode.SKIING;
                name = "SKIING";
                break;
        }  
        System.out.print("Enter distance (km): ");
        distance = sc.nextDouble();
        
        System.out.print("Enter duration (minutes): ");
        duration = sc.nextInt();
        
        System.out.print("Enter equipment used: ");
         equipment = sc.nextLine();
        // add list off equipment
        
        System.out.println("Choose an athlete by index:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println(i + ": " + athletes.get(i).getName());
        }
        athleteIndex = sc.nextInt();
        athlete = athletes.get(athleteIndex);
        calories = calculateCalories( mode, distance);
        activity = new PoweredActivity(name, mode, distance, duration, calories, athlete, equipment);
        activities.add(activity);
        System.out.println("Added activity: " + activity.getName());
    }
        private double calculateCalories(transportationMode mode, double distance) {
        switch (mode) {
            case BIKING: 
                return distance * 30;
            case ROLLERSKATES: 
                return distance * 50;
                 default: 
                     return distance * 40;
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
    
    public void listAllActivitiesDone(){
        if (activities.isEmpty()) {
            System.out.println("No activities registered yet.");
        } else {
            System.out.println("\n Activity progress:");
            for (Activity activityList : activities) {
                System.out.println("Activity: " + activityList.getName() + " Mode: " + activityList.getMode() + " Distance travelled: " + activityList.getDistance());
            }
        }
        printWelcome();
    }
}
