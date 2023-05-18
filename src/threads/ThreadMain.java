package threads;

public class ThreadMain {

    public static void main(String[] args) {
        ObjectExtend thread1 = new ObjectExtend();
        thread1.setNameObject("Hilo1");

        ObjectImplement objectImplement = new ObjectImplement();
        objectImplement.setNameObject("Hilo2");
        Thread thread2 = new Thread(objectImplement);

        thread1.run();
        thread2.run();

    }
}
