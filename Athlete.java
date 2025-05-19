import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Athlete here.
 *
 * @author Neo / Kimia
 * @version 04-29-2025
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
     * Constructor for objects of class Athlete
     */
    public Athlete(String name, int age, double weight, Gender gender)
    {
        this.id = nextId++;// assign unique ID
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender; 
    }
    
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
    
    public String getName() {
        return name; 
    }
    public void setName(String name) {
        this.name = name; 
    }

    public Gender getGender() {
        return gender; 
    }
    public void setGender(Gender gender) {
        this.gender = gender; 
    }

    public int getAge() {
        return age; 
    }
    public void setAge(int age) { 
        this.age = age;
    }

    public double getWeight() { 
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight; 
    }

     
}

