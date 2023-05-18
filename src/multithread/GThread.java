package multithread;

public class GThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            synchronized (E1Thread.class){
                System.out.print("G");
            }


        }
    }
}
