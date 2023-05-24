package generics;

// T = Type
public class GenericClass <T> {
    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public  void getType(){
        System.out.println("The type of T is: " + object.getClass().getSimpleName());
    }
}
