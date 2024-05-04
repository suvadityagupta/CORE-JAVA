import java.lang.reflect.Method;

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

public class MethodOverRiding { // method over riding 
//Method overriding is when a subclass provides a specific implementation of a method that is already defined in its superclass.
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
