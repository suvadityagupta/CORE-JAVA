//final - variable, method class 
// class Calc{
//     public void show()
//     {
//       System.out.println("In Calc show");  
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }
// final 
class Calc{ //if we make any class final then we cannot extend a class towards the final class
    //We use final class to stop inheritance
    //We use final method to stop overriding
    public void show()
    {
      System.out.println("In Calc show");  
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{ //here the Calc class is final class thats why we cannot extend the class to Calc. Its showing error. 

}
public class FinalKeyWord {
    public static void main(String[] args) {
        // final int num = 8; //we use final variable to make the varibale value constatnt
        // // num = 9;
        // System.out.println(num);
        //Final as class-->
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);


    }
}
