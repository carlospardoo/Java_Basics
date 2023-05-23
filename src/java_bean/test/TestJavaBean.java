package java_bean.test;

import java_bean.domain.Person;

public class TestJavaBean {
    public static void main(String[] args) {

        //objects created with empty constructor
        Person person = new Person();

        //Uses setters to set the attributes
        person.setName("Luis");
        person.setLastname("Perez");

        System.out.println("person = " + person);

        //Can use getters for get information
        System.out.println("Person name: " + person.getName());
        System.out.println("Person lastname: " + person.getLastname());
    }
}
