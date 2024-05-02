
class Human{
    // private String name; //we use private to make the variable private
    // private int age;
    private int age ;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

public class Encapsulation {
    //Encapsulation is a process of wrapping the data and code together as a single unit.
    //It is also known as data hiding.
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "Navin";   
        System.out.println(obj.getName() + " : " + obj.getAge());     
    }
}
