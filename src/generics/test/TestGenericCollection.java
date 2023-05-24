package generics.test;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestGenericCollection {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Lunes");
        myList.add("Martes");
        myList.add("Miercoles");
        myList.add("Jueves");
        myList.add("Viernes");
        myList.add("Sabado");
        myList.add("Domingo");
        myList.add("Domingo");

        String element = myList.get(0);
        System.out.println("element = " + element + "\n");
        print(myList);
    }

    public static void print(Collection<String> collection){
        for(String element: collection){
            System.out.println("element = " + element);
        }
    }

}
