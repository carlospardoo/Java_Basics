package instanciade.test;

import instanciade.Director;
import instanciade.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee("Juana", 1300000.0);
        System.out.println(employee.getDetails());
        getType(employee);

        Director director = new Director("Camilo", 8500000.0, "IT");
        System.out.println(director.getDetails());
    }

    public static void getType(Employee employee){
        if( employee instanceof Director ){
            System.out.println("Es de tipo gerente");
        }
        else if( employee instanceof Employee ){
            System.out.println("Es de tipo empleado");
        }
        else if(employee instanceof Object){
            System.out.println("Es de tipo object");
        }
    }

}
