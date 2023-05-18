package threads;

public class ObjectExtend extends Thread{

    private String nameObject;

    @Override
    public void run() {

        try{

            for (int i = 0; i < 10; i++) {
                System.out.println("Running object " + this.nameObject + " from extends");
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
