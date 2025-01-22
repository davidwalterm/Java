// Java Program to show the use of static variables
import java.io.*;

public class StaticVariable {
    // Declared static variable
    public static String geek = "David";
    
    public static void main(String[] args)
    {
        // geek variable can be accessed without the object
        // creation Displaying StaticVariable.geek using the static variable
        System.out.println("Geek name is: " + StaticVariable.geek);

        // static int c = 0;
        // above line will throw an error when uncomented as static variable can't be declared locally
    }
}
