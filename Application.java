import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * This class serves as the main controller for mangaging athletes,
 * recording thier workout activities, and navigating the application.
 *
 * Athors : Neo / Kimia / Floyd
 * version: (2025/05/18)
 */
public class Application
{
    private static ArrayList<Athlete> athletes;
    private static ArrayList<Activity> activities;
    private static List<String> equipmentList;
    private Scanner scanner;
    
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        Scanner scanner = new Scanner(System.in);
        athletes = new ArrayList<>();
        activities = new ArrayList<>();
        equipmentList = new ArrayList<>();
    }
    
    public void printWelcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to StrongAF, an application that records your workout!");
        System.out.println("What would you like to do today?");
        System.out.println("Select from the following");
        System.out.println("1 - SignUp");
        System.out.println("2 - Log In (Returning Athlete)");
        System.out.println("3 - ListAthletes");
        System.out.println("4 - Create Activity");
        System.out.println("5 - ListActivityHistory");
        System.out.println("Type 'quit' to exit");
        switch (scanner.next()) {
            case "1":
                athleteSignup();
                break;
            case "2":
                 loginAthlete();
                 break;    
            case "3":
                listAllAthletes();
                break;
            case "4" :
                activityCreation();
                break;
            case "5":
                 listAllActivitiesDone();
                    break;// 
        }
    }
    
        public void loginAthlete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your athlete ID: ");
        int inputId = sc.nextInt();
        
        Athlete found = null;
        for (Athlete a : athletes) {
            if (a.getId() == inputId) {
                found = a;
                break;
            }
        }
        
        if (found != null) {
            System.out.println("Welcome back, " + found.getName() + "!");
        } else {
            System.out.println("Athlete not found. Did you sign up?");
        }
    
        printWelcome(); // Return to main menu
    }
    
    public boolean isSameAthlete(Athlete a1, Athlete a2) {
        return a1.getName().equalsIgnoreCase(a2.getName()) &&
               a1.getAge() == a2.getAge() &&
               a1.getGender() == a2.getGender();
    }

        public boolean isDuplicateAthlete(Athlete newAthlete) {
        for (Athlete existing : athletes) {
            if (isSameAthlete(existing, newAthlete)) {
                return true;
            }
        }
        return false;
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
            default:
                System.out.println("Unknown gender selected. Defaulting to OTHER.");
                gender = Gender.OTHER;
        }
        Athlete athleteInfo = new Athlete(name, age, weight, gender);
        
         if (isDuplicateAthlete(athleteInfo)) {
            System.out.println("Welcome back! You're already signed up.");
        } else {
            athletes.add(athleteInfo);
            System.out.println("Sign-up successful!");
        }
        
        // athletes.add(athleteInfo);
        // System.out.println("Sign-up successful!");
         System.out.println("Your athlete ID is: " + athleteInfo.getId());
        printWelcome();
    }
    
    
    public void listAllAthletes(){
        if (athletes.isEmpty()) {
            System.out.println("No athletes registered yet.");
        } else {
            System.out.println("\nRegistered Athletes:");
            for (Athlete athlete : athletes) {
                System.out.println("- " + athlete);
            }
        }
        printWelcome();
    }
    
    public void activityCreation(){
        if (athletes.isEmpty()) {
            System.out.println("Please sign up an athlete first.");
            printWelcome();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating new activity...");
        System.out.println("Does your activity require an equipment?");
        System.out.println("Type 1 for Yes");
        System.out.println("Type 2 for No");
        switch (scanner.next()) {
            case "1":
                poweredActivity();
                break;
            case "2":
                standardActivity();
                break;
            default:
                System.out.println("Invalid activity type.");
                break;
           
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
            default:
                System.out.println("Invalid activity.");
        }
    }
    
    public Athlete selectAthlete() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose an athlete by index:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println(i + ": " + athletes.get(i).getName());
        }
        int index = sc.nextInt();
        return athletes.get(index);
    }
    
    public void chooseRunning(){
        double distance;
        double speed;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        String equipment;
        Athlete athlete;
        
        
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
        equipment = null;
        Activity running = new Activity (name, mode, equipment, distance, duration, caloriesBurned /*athlete*/);
        activities.add(running);
    }
    
    public void chooseWalking(){
        double distance;
        double speed;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        String equipment;
        Athlete athlete;

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
        equipment = null;
        Activity walking = new Activity (name, mode,equipment, distance, duration, caloriesBurned /*athlete*/);
        activities.add(walking);
    }
    
    public static void choosePlanks(){
        int amount;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        double distance;
        String equipment;
        Athlete athlete;

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
        equipment = null;
        Activity planks = new Activity (name, mode, equipment,distance, duration, caloriesBurned/* athlete*/);
        activities.add(planks);
    }
    
    public static void choosePushUps(){
        int amount;
        int duration;
        double caloriesBurned;
        String name;
        transportationMode mode;
        double distance;
        String equipment;
        Athlete athlete;

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
        equipment = null;
        Activity pushUps = new Activity (name, mode, equipment, distance, duration, caloriesBurned/*athlete*/);
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
        ArrayList<String> equipmentList = new ArrayList<>();
        equipmentList.add("Bike");
        equipmentList.add("Rollerskates");
        equipmentList.add("Skiis");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What equipment would you like to use? We have presets or you can create your own!");
        System.out.print("\nType the ones in the list OR ");
        System.out.print("\nType create your own");
        for (String equipments : equipmentList) {
            System.out.println( "\n" + equipments);
        }
        mode = null;
        name = null;
        switch (sc.next()) {
            case "Bike":
                equipment = "Bike";
                mode = transportationMode.BIKING;
                name= "BIKING";
                break;
            case "Rollerskates":
                equipment = "Rollerskates";
                mode = transportationMode.ROLLERSKATES;
                name = "ROLLERSKATES";
                break;
            case "Skiis" :
                equipment = "Skiis";
                mode = transportationMode.SKIING;
                name = "SKIING";
                break;
            default :
                sc.nextLine();
                System.out.println("What equipment would you like to use?");
                equipment = sc.nextLine();
                System.out.println("What would you like to call your activity?");
                name = sc.nextLine();
                equipmentList.add(name);
                mode = null;
                break;
        }  
        System.out.print("Enter distance (km): ");
        distance = sc.nextDouble();
        
        System.out.print("Enter duration (minutes): ");
        duration = sc.nextInt();
        
        athlete = selectAthlete();
        calories = calculateCalories( mode, distance);
        PoweredActivity activityP = new PoweredActivity(name, mode, equipment, distance, duration, calories, athlete);
        activities.add(activityP);
        System.out.println("Added activity: " + activityP.getName());
    }
    
    private double calculateCalories(transportationMode mode, double distance) {
        switch (mode) {
            case BIKING: 
                System.out.println("Calories Burnt:");
                System.out.println(distance * 30);
                break;
            case ROLLERSKATES: 
                System.out.println("Calories Burnt:");
                System.out.println(distance * 50);
                break;
            case SKIING:
                System.out.println("Calories Burnt:");
                System.out.println(distance * 50);
                break;
            case null: // for the created Equipment
                System.out.println("Calories Burnt:");
                System.out.println(distance * 50);
                break;
        }
        return distance;
    }
    
    public void quit(){
       
        String name;
        if (scanner.equals("quit")) {
            scanner.close();
         }
         System.out.println("Goodbye! Application closed.");
       
    }
   
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
            for (Activity activity : activities) {
                System.out.println("\n" + activity.toString());
            }
        }
        printWelcome();
    }

}
