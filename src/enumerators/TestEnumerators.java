package enumerators;

public class TestEnumerators {
    public static void main(String[] args) {
//        System.out.println("Dia 1: "+ Dias.LUNES);
//
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente #4: " + Continent.AMERICA);
        System.out.println("Numero de paises en el continente #4: " + Continent.AMERICA.getCountries());

    }

    private static void indicarDiaSemana(Dias dia){
        switch (dia){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
