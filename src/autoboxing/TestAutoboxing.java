package autoboxing;

public class TestAutoboxing {

    public static void main(String[] args) {
        
        Integer valor = 7; //Autoboxing

        System.out.println("El valor objeto es: " + valor.toString() );

        System.out.println("valor en double = " + valor.doubleValue());
        
        //unboxing
        int valorNuevo = valor;
        System.out.println("valorNuevo = " + valorNuevo);
        
    }
    
}
