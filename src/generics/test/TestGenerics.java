package generics.test;

import generics.GenericClass;

public class TestGenerics {

    public static void main(String[] args) {
        GenericClass<Integer> objetoInteger = new GenericClass<>(15);
        objetoInteger.getType();

        GenericClass<String> objetoString = new GenericClass<>("Luis");
        objetoString.getType();
    }
}
