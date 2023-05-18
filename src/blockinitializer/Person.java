package blockinitializer;

public class Person {

    private final int idPerson;

    private static int personsCount;

    static{
        System.out.println("Bloque de incializacion estatico");
        ++Person.personsCount;
    }

    {
        System.out.println("Bloque de incializacion NO estatico");
        this.idPerson = personsCount++;
    }

    public Person(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                '}';
    }
}
