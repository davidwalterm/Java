public class RunningThread extends Thread{
    public static void main(String[] args){
        RunningThread thread = new RunningThread();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
