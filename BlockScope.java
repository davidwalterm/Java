// Using Block Scope

public class BlockScope {
    public static void main(String[] args){
        // Block Level Scope
        {
            // The variable x has scope within brackets
            int x = 10;
            System.out.println(x);
        }

        // Uncommenting the line below will produce error since since variable x is out of scope
        //System.out.println(x);
    }
}
