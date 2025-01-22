// Java Program to show the local use of variables
import java.io.*;

public class LocalVariables {
    public static void main(String[] args)
    {
        // x is local variable
        int x = 10;

        // message is also a local variable
        String message = "Hello World!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if(x > 5){
            //result is a local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        //Uncommenting the line below will result in a compile time error
        //System.out.println(result);

        for(int i = 0; i < 3; i++){
            String loopMessage = "Iteration " + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

        //Uncommenting the line below will resut in a compile time error
        //System.out.println(loopMessage);
    }
}
