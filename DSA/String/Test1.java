package String;

public class Test1 {

    //String is immutable for security reason
    // String Pool: It is a seperate memory structure inside heap so that we can fetch that same object without 
    // creating new object
    public static void main(String[] args) {
        String name = "Md Ameer";
        name = "Humjah"; //creating new object "Humjah";

        System.out.println(name);
    }
}
