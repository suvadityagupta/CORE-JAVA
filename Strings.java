public class Strings {
    //Strings are immutable in java
    //
    
    public static void main(String[] args) {
    //    String name = new String("navin");
    //    System.out.println(name);
    //    System.out.println("hello " + name);
    //    System.out.println(name.charAt(1));
    //    System.out.println(name.concat(" reddy"));
    //  String name = "Navin";
    //  name = name + " Reddy";
    //  System.out.println(name);
        StringBuffer sb = new StringBuffer("Navin");
        // System.out.println(sb.capacity()); //It will print the default capacity of the string buffer
        sb.append(" Reddy");
        sb.insert(6,"Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb);
        // sb.deleteCharAt(2); //There are several methods we can try

        //String buffer is thread safe, string builder is not

    }
}
