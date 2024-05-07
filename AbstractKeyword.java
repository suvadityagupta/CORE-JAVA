class Car {
    public void drive(){
        System.out.println();

    }
    public void playMusic(){
        System.out.println("Play Music");
        
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
        obj.playMusic();
    }
}
