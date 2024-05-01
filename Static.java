class Mobile{
    String brand;
    int price;
    static String name; //static variable will share the same value with all the objects. That means if we change the value of static variable, it will change the value for all the objects.
    //To initialize name only once we will use static block.
    //Static block
    //Constructor
    public Mobile()
    {
        brand ="";
        price = 200;
        System.out.println("in constructor");
    }
    static {
    name = "Phone";
        System.out.println("in static block");
    }
    // why the constructor is printed first
    //class loads then objects are instantiated

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Mobile obj){
        System.out.println("in static method");
        // System.out.println(brand + " : " + price + " : " + name); //We can use static variable in static method but we cannot use non static variable in static method.
        //If we have obj reference then we can use non static variable in static method.
        //like
        System.out.println(obj.brand + " : " + obj.price + " : " + name);

    }

}
public class Static {
    public static void main(String[] args) 
    // throws ClassNotFoundException
    {
        
        //to load the class witthout object we use -->
        // Class.forName("Mobile");

        
        
        Mobile obj1 = new Mobile();
        obj1.brand= "Apple";
        obj1.price= 50000;
        Mobile.name= "Iphone 5";  //We should use Mobile class name to access the static variable.
       
        // Mobile obj2 = new Mobile();

        
        Mobile obj2 = new Mobile();
        obj2.brand= "Samsung";
        obj2.price= 50000;
        Mobile.name= "Note 5"; 

        Mobile.name = "Phone"; //It will eventually change the value of name for all the objects.
        obj1.show();
        obj2.show() ;
        
        Mobile.show1(obj1); //We use this to call the static method.
        // obj1.show1(); //This will give an error.

     }
}
//What is static keyword?
//Ans.You are making something as a class member not a object member. So static name here belongs to the class not to the object thats why we were able to use as a class name
//Why we use static variable? 
//If we want to share the same value with all the objects.
// static variable is a class variable.

