//What is inheritance in Oops? 
//Ans: Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
 //We can call any object which is already created as a parent object.
//here we have called the parent class as Calc 
//the Calc class is in different file so we have to import it
//Thats how we can inherit the properties of parent class to child class
//we can also call the methods of parent class in child class
//we can also call the variables of parent class in child class
//To call the class we have to make and object of that class

public class Inheritance { 
    public static void main(String[] args) {
        // Calc obj = new Calc();
        VeryAdvCalc obj = new VeryAdvCalc(); //Multi level inheritance 
        int r1 = obj.add(10, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj.mul(10, 5);
        int r4 = obj.div(10, 5);
        double r5 = obj.power(2,4);
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);      

    }
}
