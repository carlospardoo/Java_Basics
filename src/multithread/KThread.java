package multithread;

public class KThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (GThread.class){
                System.out.println("K");

            }
        }
    }
}
