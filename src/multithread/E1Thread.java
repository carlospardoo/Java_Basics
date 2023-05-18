package multithread;

public class E1Thread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            synchronized (this){
                System.out.print("E1");

            }
        }
    }
}
