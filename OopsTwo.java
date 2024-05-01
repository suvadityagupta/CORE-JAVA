class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }
    public String getMeAPen(int cost){
        if (cost>=10) 
            return "pen";
        return "nothing";
        
    }
}
public class OopsTwo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(9);
        System.out.println(str);
    }
}
