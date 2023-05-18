package threads;

public class ObjectImplement implements Runnable{

    private String nameObject;

    @Override
    public void run() {

        try{

            for (int i = 0; i < 10; i++) {
                System.out.println("Running object " + this.nameObject + " from implements");
                Thread.sleep(0);
            }

        }
        catch (InterruptedException e){
            System.out.println("e = " + e);
        }

    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }
}
