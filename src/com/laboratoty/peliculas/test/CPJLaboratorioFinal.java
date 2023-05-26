package com.laboratoty.peliculas.test;

import com.laboratoty.peliculas.datos.AccesoDatosImpl;
import com.laboratoty.peliculas.negocio.CatalogoPeliculas;
import com.laboratoty.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        int opcion;
        String nombreArchivo = "peliculas1.txt";
        CatalogoPeliculas catalogoPeliculas;

        Scanner sc = new Scanner(System.in);

        catalogoPeliculas = new CatalogoPeliculasImpl(new AccesoDatosImpl());

        menu: while (true){

            System.out.println("Elige opcion: ");
            System.out.println("1.- Iniciar catálogo películas");
            System.out.println("2.- Agregar película");
            System.out.println("3.- Listar películas");
            System.out.println("4.- Buscar película");
            System.out.println("0.- Salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    catalogoPeliculas.iniciarArchivo(nombreArchivo);
                    break;
                case 2:
                    System.out.println("Introduce el nombre de una película a agregar:");

                    String pelicula = sc.next();

                    catalogoPeliculas.agregarPelicula(pelicula, nombreArchivo);

                    break;
                case 3:
                    catalogoPeliculas.listarPeliculas(nombreArchivo);
                    break;
                case 4:
                    System.out.println("Escriba el nombre de la pelicula a buscar");
                    String buscar = sc.next();
                    catalogoPeliculas.buscarPelicula(nombreArchivo, buscar);
                    break;
                case 0:
                        break menu;
//                    break;
                default:
                    System.out.println("Especifique una opción válida");
            }
        }



    }

}
