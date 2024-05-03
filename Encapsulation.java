class Human {
    // Instance variable to store the age of a human
    private int age; 
    // Instance variable to store the name of a human
    private String name;
    public Human() //Default constructor
        { 
        // here we are doing the encapsulation and we are making the variable private
        //its a constructor it does not have a return type. We use this to initialize the variables for the object
        age = 12;
        name = "John";
    }
    public Human(int a, String n) //Parameterized constructor
    {
    age = a;
    name = n;
    }

    // Getter method to retrieve the age of a human
    public int getAge() {
        return age;
    }

    // Setter method to set the age of a human
    public void setAge(int age) {
        // age = a;
        this.age = age; //this - is a keyword that refers to the current object

    }

    // Getter method to retrieve the name of a human
    public String getName() {
        return name;
    }

    // Setter method to set the name of a human
    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        // Create an instance of the Human class
        Human obj = new Human();
        Human obj1 = new Human(18, "navin");
        System.out.println(obj.getName() + " : " + obj.getAge()); //here happens the encapsulation how we can access the private variable
        System.out.println(obj1.getName() + " : " + obj1.getAge()); //here happens the encapsulation how we can access the private variable

        

        // Set the age of the human using the setter method
        // obj.setAge(30);

        // Set the name of the human using the setter method
        // obj.setName("Navin");

        // Print the name and age of the human using the getter methods
        // System.out.println(obj.getName() + " : " + obj.getAge());     
    }
}