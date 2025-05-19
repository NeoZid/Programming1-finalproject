import java.util.ArrayList;
import java.util.Scanner;
/**
 * Stores personal details like name, age, genderr, and weight,
 * and assigns a unique ID to each athlete.
 * 
 * Athors : Neo / Kimia / Floyd
 * version: (2025/05/18)
 */
public class Athlete
{
    private static int nextId = 1; // Static counter
    private final int id;
    private String name;
    private Gender gender;
    private int age;
    private double weight;
    

    /**
     * Constructors a new Athelte with the provided details.
     * A unique ID is assigned automatically.
     */
    public Athlete(String name, int age, double weight, Gender gender)
    {
        this.id = nextId++;// assign unique ID
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender; 
    }
    
    /**
     * Gets unique ID of the athlete.
     * @return athlete ID
     */
    public int getId() {
        return id;
    }
    
    public String toString(){
        return "\nID: " + id +
                "\nName:" + name + 
                "\nAge:" + age +
                "\nWeight:" + weight + 
                "\nGender:" + gender;
    }
    
    /**
     *Gets the name of the athlete.
     *@return name 
     */
    public String getName() {
        return name; 
    }
    
    /**
     * Sets the name of the athlete. 
     */
    public void setName(String name) {
        this.name = name; 
    }

     /**
     * Gets the athletes gender.
     * @return gender.
     */
    public Gender getGender() {
        return gender; 
    }
    
    /**
     * Sets the athletes gender. 
     */
    public void setGender(Gender gender) {
        this.gender = gender; 
    }

     /**
     * Gets the athletes age.
     * @return age.
     */
    public int getAge() {
        return age; 
    }
     /**
     * Sets the athletes age.
     * @return age.
     */
    public void setAge(int age) { 
        this.age = age;
    }

     /**
     * Gets the athletes weight.
     * @return weight.
     */
    public double getWeight() { 
        return weight;
    }
    
    /**
     * Sets the athletes weight.
     * @return weight.
     */
    public void setWeight(double weight) {
        this.weight = weight; 
    }
}

