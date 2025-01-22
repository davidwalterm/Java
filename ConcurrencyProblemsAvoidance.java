public class ConcurrencyProblemsAvoidance extends Thread {
    public static int amount = 0;

    public static void main(String[] args){
        ConcurrencyProblemsAvoidance thread = new ConcurrencyProblemsAvoidance();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        // Update amount and print it's value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run(){
        amount++;
    }
}
