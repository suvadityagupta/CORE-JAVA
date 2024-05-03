class A extends Object//Every class in java extends the object class
{
    //super is a method which is used to call the parent class constructor
    //Its default in the system.If we are not mentioning it, then it will be called automatically. Its there in the system as we can see this in the class diagram of java. 
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
} 
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    
    public B(int n){
        // super(); //Now it will call the default constructor
        super(n); //Now it will call the parameterised constructor
        System.out.println("In B int");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
    
}
