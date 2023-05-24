package java_bean.domain;

import java.io.Serializable;

//Serializable enables to send the object as bytes across the internet or the disk
public class Person implements Serializable {

    private String name;

    private String lastname;

    public Person() {

    }

    //Not required for a java bean
    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //Not required for a java bean
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
