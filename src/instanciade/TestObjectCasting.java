package instanciade;

public class TestObjectCasting {

    public static void main(String[] args) {
        Employee employee;

        employee = new Writer("Pepito", 750000, WriteType.CLASSIC);

        System.out.println(employee.getDetails());
        System.out.println( ((Writer) employee).getWriterType() ); //Downcasting

        Writer writer = (Writer) employee;
        System.out.println(writer.getWriterType());

        Employee employee1 = writer; //Upcasting. Se hace automatico
        Employee employee2 = (Employee) writer; //Upcasting. Se hace automatico
    }

}
