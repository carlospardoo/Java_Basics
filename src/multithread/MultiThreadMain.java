package multithread;

public class MultiThreadMain {

    public static void main(String[] args) {

        GThread g = new GThread();
        E1Thread e1 = new E1Thread();
        E2Thread e2 = new E2Thread();
        KThread k = new KThread();



        try{
            g.start();
//            g.sleep(1000);

            e1.start();
//            e1.sleep(1000);

            e2.start();
//            e2.sleep(1000);

            k.start();
//            k.sleep(1000);

            g.join();
            e1.join();
            e2.join();
            k.join();

        }
        catch (InterruptedException e){
            System.out.println("Error: "+e.getMessage());
        }


    }

}
