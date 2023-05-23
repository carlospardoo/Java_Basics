package instanciade.test;

import instanciade.Employee;

public class TestObjectClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lucio", 2500000);
        Employee employee2 = new Employee("Lucio", 2500000);

        if(employee1 == employee2)
            System.out.println("Tienen la misma referencia en memoria");

        else
            System.out.println("Tienen distinta referencia en memoria");

        if(employee1.equals(employee2))
            System.out.println("Los objetos son iguales en contenido");

        else
            System.out.println("Los objetos son distintos en contenido");

        if(employee1.hashCode() == employee2.hashCode())
            System.out.println("El valor hashcode es igual");
        else
            System.out.println("El valor hashcode es distinto");
    }
}
