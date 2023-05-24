package collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Lunes");
        myList.add("Martes");
        myList.add("Miercoles");
        myList.add("Jueves");
        myList.add("Viernes");
        myList.add("Sabado");
        myList.add("Domingo");
        myList.add("Domingo");

//        myList.stream().forEach(x -> System.out.println(x));
//
//        myList.forEach(x -> System.out.println(x) );
        print(myList);

        System.out.println("\nSET\n");

        //Set es mas rapido en sus operaciones
        //los elementos no se ordenan
        //Elementos no pueden ser duplicados
        Set mySet = new HashSet();

        mySet.add("Lunes");
        mySet.add("Martes");
        mySet.add("Miercoles");
        mySet.add("Jueves");
        mySet.add("Viernes");
        mySet.add("Sabado");
        mySet.add("Domingo");
        mySet.add("Domingo");

        print(mySet);

        System.out.println("\nMAP\n");

        Map myMap = new HashMap<>();
        myMap.put("valor1", "Luis");
        myMap.put("valor2", "Carlos");
        myMap.put("valor3", "Luisa");

        String element = (String) myMap.get("valor1");

        print(myMap.keySet());
        print(myMap.values());
        print(myMap.entrySet());

    }

    public static void print(Collection collection){
        for(Object element: collection){
            System.out.println("element = " + element);
        }
    }

}
