class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {
        //Upcasting
        // A obj = (A)new B();
        A obj = new B();
        obj.show1();
        //Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}
